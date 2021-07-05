package entities;

public class List {

    private Node head;

    public void add(Double value) {
        Node node = new Node();
        node.setValue(value);
        node.setNext(head);
        head = node;

    }

    public String pesquisa(Double value) {
        Node node = head;
        while (node != null) {
            double aux = node.getValue();
            if (aux == value) {
                return "Existe.";
            }
            node = node.getNext();
        }
        return "Nao existe.";
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        Node p = head;
        while (p != null) {
            sb.append(p.getValue() + " ");
            p = p.getNext();
        }

        sb.append("]");
        return sb.toString();
    }
}
