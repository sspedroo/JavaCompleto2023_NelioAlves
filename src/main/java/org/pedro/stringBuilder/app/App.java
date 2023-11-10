package org.pedro.stringBuilder.app;

import org.pedro.stringBuilder.entities.Comment;
import org.pedro.stringBuilder.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow... That's awesome!");
        Post p1  = new Post(LocalDateTime.parse(
                "21/06/2018 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Good Night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(LocalDateTime.parse(
                "28/07/2018 23:14:19", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}
