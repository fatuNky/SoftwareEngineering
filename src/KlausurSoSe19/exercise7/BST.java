package KlausurSoSe19.exercise7;

public class BST {

    private Node root;

    public void insert(int x){
        if (root==null) {
            root = new Node(x);
        }
        root.insert(x);
    }
}
