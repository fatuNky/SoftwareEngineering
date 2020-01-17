package uebung11;

public class Node {

    private int content;
    private Node left;
    private Node right;

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int content) {
        this.content = content;
    }


    public void insert(int content) {

        if (content < this.content) {
            if (left == null) {
                Node node = new Node(content);
                left = node;
            } else {
                left.insert(content);
            }
        }

        if (content > this.content) {
            if (right == null) {
                Node node = new Node(content);
                right = node;
            } else {
                right.insert(content);
            }
        }
    }

    public int size() {
        int size = 1;

        if (left != null) {
            size += left.size();
        }
        if (right != null) {
            size += right.size();
        }
        return size;
    }

    public boolean contains(int content) {

        boolean doesContain = false;
        if (content == this.content) {
            doesContain = true;
        }

        if (content < this.content && left != null) {
            doesContain = left.contains(content);
        }

        if (content > this.content && right != null) {
            doesContain = right.contains(content);
        }
        return doesContain;
    }

    public boolean isFull() {

        if (left == null && right == null) {
            return true;
        }

        if (left != null && right != null) {
            return (left.isFull() && right.isFull());
        }
        return false;

    }

}
