package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

//        String c1 = "Have a nice trip!";
//        String c2 = "Wow that's awesome!";
        Post post1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                        "Traveling to New Zealand",
                        "I'm going to visit this wonderful country!",
                        12
        );
        post1.addComment(new Comment("Have a nice trip!"));
        post1.addComment(new Comment("Wow that's awesome!"));

//        String c3 = "Good night";
//        String c4 = "May the Force be with you";
        Post  post2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5
        );
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println(post1);
        System.out.println(post2);

        sc.close();
    }
}
