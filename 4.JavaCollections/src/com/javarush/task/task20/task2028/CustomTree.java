package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;
    int size;

    public CustomTree() {
        this.root = new Entry<>("root");
        size = 0;
    }

    @Override
    public boolean add(String s) {
        LinkedList<Entry<String>> queue = new LinkedList<>();

        queue.add(root);

        Entry<String> entry = null;
        Entry<String> newElement = new Entry<>(s);

        while (!queue.isEmpty()) {
            entry = queue.poll();
            if (entry.availableToAddLeftChildren) {
                // add to the left child
                entry.leftChild = newElement;
                newElement.parent = entry;
                //entry.checkChildren();
                entry.availableToAddLeftChildren = false;
                size++;
                break;
            } else {
                if (entry.leftChild != null) {
                    queue.add(entry.leftChild);
                }
            }

            if (entry.availableToAddRightChildren) {
                // add to the right child
                entry.rightChild = newElement;
                newElement.parent = entry;
                //entry.checkChildren();
                entry.availableToAddRightChildren = false;
                size++;
                break;
            } else {
                if (entry.rightChild != null) {
                    queue.add(entry.rightChild);
                }
            }
        }

        return true;

    }

    public String getParent(String s) {
        LinkedList<Entry<String>> queue = new LinkedList<>();

        queue.add(root);

        Entry<String> entry = null;
        Entry<String> result = null;

        while (!queue.isEmpty()) {
            entry = queue.poll();

            if (entry.elementName.equals(s)) {
                result = entry.parent;
                break;
            }

            if (!entry.availableToAddLeftChildren) {
                queue.add(entry.leftChild);
            }

            if (!entry.availableToAddRightChildren) {
                queue.add(entry.rightChild);
            }

        }

        return result == null ? null : result.elementName;
    }


    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return size;
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}
