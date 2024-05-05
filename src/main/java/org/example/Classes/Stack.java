package org.example.Classes;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        return items.removeLast();
    }

    public List<T> getItems() {
        return items;
    }

    public T peek() {
        return items.getLast();
    }

}
