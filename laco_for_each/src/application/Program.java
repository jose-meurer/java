package application;

public class Program {

    public static void main(String[] args) {

        String[] vect = new String[]{
                "Maria",
                "José",
                "Joao",
                "Leonardo",
                "Julio",
                "Lucas",
                "Gustavo",
                "Ana",
                "Marcia",
                "Irene"
        };

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("_____________________________________________________________________");
        for (String obj : vect) { //Para cada objeto tipo String dentro de um vetor ler um obj
            obj += " vizinho";
            System.out.println(obj);
        }
    }
}
