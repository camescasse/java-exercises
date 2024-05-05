package org.example.Classes;

import java.time.Instant;
import java.util.Date;

public class Post {
    String title;
    String description;
    Date dateTime;
    int votes;

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
        this.dateTime = Date.from(Instant.now());
        this.votes = 0;
    }

    public void upVote() {
        votes++;
    }

    public void downVote() {
        votes--;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateTime=" + dateTime +
                ", votes=" + votes +
                '}';
    }

}
