package app;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    public void insert(int value) { //Inseri o valor passado do array
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node root, int value) {
        if (root == null) { //Verifica se o node já existe
            return new Node(value); //Retorna um novo node com o valor
        }
        if (value < root.getValue()) { //Verifica se o node é maior que o node do lado esquerdo
            Node node = insertRecursive(root.getLeft(), value);
            root.setLeft(node);
            //root.setLeft(insertRecursive(root.getLeft(), value));
        } else if (value > root.getValue()) { //Verifica se o node é maior que o node do lado direto
            root.setRight(insertRecursive(root.getRight(), value)); //Chama a mesma função para fazer passo a passo e inserir o node
        }

        return root; //Retorna o root com os novos nodes
    }
    private void inOrderTraversal(Node node, List<Integer> sortedList) { //Verifica a arvore e adiciona na lista ordenada
        if (node != null) { //Verifica se o node nao é nulo
            inOrderTraversal(node.getLeft(), sortedList); //Verifica a arvore de nodes do lado esquerdo
            sortedList.add(node.getValue()); //Adiciona na lista
            inOrderTraversal(node.getRight(), sortedList); //Verifica a arvore de nodes do lado direito e chama a mesma funcao, adicionando apenas quando é do lado esquerdo
        }
    }

    public List<Integer> getSortedArray() { //Chamada para retornar um array ordenado
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        return sortedList;
    }
}
