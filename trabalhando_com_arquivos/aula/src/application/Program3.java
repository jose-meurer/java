package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        //try-with-resources

        String path = "D:\\workspace\\Projetos\\Curso_Udemy_Java_Nelio_Alves\\trabalhando_com_arquivos\\aula\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
