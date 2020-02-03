package KlausurSoSe19.exercise7;

public class Node {

    private Node left;
    private Node right;
    int content;

    public Node(int content) {
        this.content = content;
    }

    public void insert(int x) {
        if (this.content < x) {
            if (right != null) {
                right.insert(x);
            } else {
                right = new Node(x);
            }
        }
        if (this.content > x) {
            if (left != null) {
                left.insert(x);
            } else {
                left = new Node(x);
            }
        }
    }
}
