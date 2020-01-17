package Klausur.exercise10;

public class BinarySearchTree {

    private Node root;

    public void insert(int content) {

        if (root == null) {
            Node node = new Node(content);
            root = node;
        } else {

            root.insert(content);
        }
    }

    public int size() {
        if (root == null) {
            return 0;
        }

        return root.size();
    }

    //TODO: Implement contains Method
}

