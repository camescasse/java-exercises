package org.example;

import org.example.Classes.Post;

public class Main {
    public static void main(String[] args) {
        var post1 = new Post("the title indeed", "most descriptive description");
        post1.upVote();
        post1.upVote();
        post1.downVote();
        System.out.println(post1);
    }
}