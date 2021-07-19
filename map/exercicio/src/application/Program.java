package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("SSS");
        Date now = new Date();

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

        //Testando tempo de execucao do programa
        Date after = new Date();

        Integer n = Integer.parseInt(sdf.format(now));
        Integer x = Integer.parseInt(sdf.format(after));

        Integer sum = x - n;

        System.out.println(sum);
    }
}
