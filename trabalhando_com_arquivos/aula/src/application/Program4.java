package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
    public static void main(String[] args) {
        // FileWriter and BufferedWriter
        String[] lines = new String[] {
                "Good morning",
                "Good afternoon",
                "Good evening"
        };

        String path = "D:\\workspace\\Projetos\\Curso_Udemy_Java_Nelio_Alves\\trabalhando_com_arquivos\\aula\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            // Apenas path, cria ou recria o arquivo || Colocando path, true, cria ou acrescenta no final do arquivo.
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
