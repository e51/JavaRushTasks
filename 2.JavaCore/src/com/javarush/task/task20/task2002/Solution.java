package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("task2002", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("Ivan");
            user1.setLastName("Ivanov");
            user1.setBirthDate(new Date());
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);

            User user2 = new User();
            user2.setFirstName("Elena");
            user2.setLastName("Petrova");
            user2.setBirthDate(new Date());
            user2.setMale(false);
            user2.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user1);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(user1.equals(loadedObject.users.get(0)));
            System.out.println(user2.equals(loadedObject.users.get(1)));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (User user : users) {
                if (user != null) {
//                    bw.write("yes");
//                    bw.newLine();
//                    bw.write(user.getFirstName());
//                    bw.newLine();
//                    bw.write(user.getLastName());
//                    bw.newLine();
//                    bw.write(String.valueOf(user.getBirthDate().getTime()));
//                    bw.newLine();
//                    bw.write(String.valueOf(user.isMale()));
//                    bw.newLine();
//                    bw.write(user.getCountry().toString());
//                    bw.newLine();

                    outputStream.write("yes".getBytes());
                    outputStream.write("\n".getBytes());
                    outputStream.write(user.getFirstName().getBytes());
                    outputStream.write("\n".getBytes());
                    outputStream.write(user.getLastName().getBytes());
                    outputStream.write("\n".getBytes());
//                    outputStream.write(new SimpleDateFormat("dd MM yyyy").format(user.getBirthDate()).getBytes());
                    outputStream.write(String.valueOf(user.getBirthDate().getTime()).getBytes());
                    outputStream.write("\n".getBytes());
                    outputStream.write(String.valueOf(user.isMale()).getBytes());
                    outputStream.write("\n".getBytes());
                    outputStream.write(user.getCountry().toString().getBytes());
                    outputStream.write("\n".getBytes());
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            while (br.ready()) {
                String line = br.readLine();
                if ("yes".equals(line)) {
                    User user = new User();
                    user.setFirstName(br.readLine());
                    user.setLastName(br.readLine());
//                    user.setBirthDate(new SimpleDateFormat("dd MM yyyy").parse(br.readLine()));
                    user.setBirthDate(new Date(Long.valueOf(br.readLine())));
                    user.setMale(Boolean.valueOf(br.readLine()));
                    switch (br.readLine()) {
                        case "UKRAINE" :
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "RUSSIA" :
                            user.setCountry(User.Country.RUSSIA);
                            break;
                        case "OTHER" :
                            user.setCountry(User.Country.OTHER);
                            break;
                    }
                    users.add(user);
                }
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
