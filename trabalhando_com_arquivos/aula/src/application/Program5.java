package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        //Manipulando pastas com File
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: "); // Caminho do diretorio
        //String strPath = sc.nextLine();
        File path = new File(sc.nextLine()); // recebe uma String com o caminho do arquivo

        File[] folders = path.listFiles(File::isDirectory); // Cria um array com as pastas
        System.out.println();
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // Croa um array com os arquivos
        System.out.println();
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println();
        System.out.print("Name new Directory: ");
        String newDr = sc.next();
        boolean success = new File(path + "\\" + newDr).mkdir(); // Cria a pasta
        System.out.println("Directory created sucessfully: " + success);

        sc.close();
    }
}
