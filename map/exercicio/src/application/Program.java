package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<String, Integer> votesCandidate = new HashMap<>();

        File path = new File("in.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if (votesCandidate.containsKey(name)) {
                    int totalVotes = votesCandidate.get(name) + votes;
                    votesCandidate.put(name, totalVotes);
                } else {
                    votesCandidate.put(name, votes);
                }
                line = br.readLine();
            }

            for (String key : votesCandidate.keySet()) {
                System.out.println(key + ": " + votesCandidate.get(key));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
