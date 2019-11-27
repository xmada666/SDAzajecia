package zadanie20191123.Lista;

public class ListtaSDAimpl implements ListaSDA {

    private Node root;


    @Override
    public void addElement(String value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node newElement = new Node(value);
            temp.setNext(newElement);
        }

    }


    @Override
    public void addElement(int index, String element) {
        if (index > size() - 1)
            return;
        Node temp = root;
        if (index == 0) {
            Node newNode = new Node(element);
            newNode.setNext(root);
            root = newNode;
        }

        for (int i =1; i <index; i++) {
            temp = temp.getNext();
        }
            Node previous = temp.getNext();
          Node newNode = new Node(element);
          temp.setNext(newNode);
          newNode.setNext(previous);
        }



    @Override
    public int size() {
        Node temp = root;
        if (root == null) return 0;
        int size = 1;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            size++;
        }


        return size;
    }

    @Override
    public void remove(String element) {

    }

    @Override
    public int findIndex(String toFind) {
        Node temp = root;
        int index = 0;
        while (temp.getNext() != null) {
            if (toFind.equals(temp.getValue()))
                return index;
            index++;
            temp = temp.getNext();
        }
        return -1;
    }

    @Override
    public String print() {
        Node temp = root;
        StringBuilder sb = new StringBuilder();
        while (temp.getNext() != null) {
            sb.append(temp.getValue());
            sb.append("\n");
            temp = temp.getNext();

        }
        sb.append(temp.getValue());
        return sb.toString();
    }
}
