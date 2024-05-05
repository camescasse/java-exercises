package org.example;

import org.example.Classes.Stack;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack<>();
        stack.push(1);
        stack.push("second");
        stack.push(true);
        System.out.println(stack.pop());
        System.out.println(stack.getItems());
    }
}