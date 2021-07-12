package application;

import entities.LogUser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<LogUser> setUser = new HashSet<>(); //O mais rapido

        File path = new File("in.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(" ");
                String name = fields[0];
                Date dateuser = Date.from(Instant.parse(fields[1]));

                setUser.add(new LogUser(name, dateuser));
                line = br.readLine();
            }

            System.out.println("Total users: " + setUser.size());

            System.out.println();
            for (LogUser user : setUser) {
                System.out.println(user);
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
