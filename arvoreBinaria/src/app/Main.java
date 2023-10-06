package app;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(84, 1, 4, 98, 12, 2, 66, 45);
        Tree binaryTree = new Tree();

        for (int x : list) {
            binaryTree.insert(x);
        }

        List<Integer> sortedList = binaryTree.getSortedArray();
        System.out.println("Array ordenado: " + sortedList);
    }
}