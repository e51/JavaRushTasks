package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Connection established with: " + socket.getRemoteSocketAddress());

            try (Connection connection = new Connection(socket);) {
                String username = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, username));
                notifyUsers(connection, username);
                serverMainLoop(connection, username);
                connectionMap.remove(username);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, username));
                ConsoleHelper.writeMessage("Cоединение с удаленным адресом закрыто");

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Ошибка при обмене данными с удаленным адресом");
            }

        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String username = null;
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if (message.getType() == MessageType.USER_NAME) {
                    username = message.getData();
                    if (username != null && !username.isEmpty() && !connectionMap.containsKey(username)) {
                        // OK
                        connectionMap.put(username, connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        break;
                    } else {
                        // Not OK
                    }
                }
            }

            return username;
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if (!entry.getKey().equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey()));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    Message newMsg = new Message(MessageType.TEXT, userName + ": " + message.getData());
                    sendBroadcastMessage(newMsg);
                } else {
                    ConsoleHelper.writeMessage("Error occurred");
                }
            }
        }
    }

    public static void sendBroadcastMessage(Message message) {
        for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
            try {
                entry.getValue().send(message);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error");
            }
        }
    }

    public static void main(String[] args) {

        int port = ConsoleHelper.readInt();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("We are ON!");
        while (true) {
            Socket socket = null;
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    serverSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                break;
            }
            new Handler(socket).start();
        }

    }
}
