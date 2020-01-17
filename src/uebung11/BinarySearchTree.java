package uebung11;

public class BinarySearchTree {

    private Node root;


    public void insert(int content) {

        if(root==null) {
            Node node = new Node(content);
            root = node;
        }else {
            root.insert(content);
        }
    }

    public int size() {
        if(root==null) {
            return 0;
        }

        return root.size();
    }

    public boolean contains(int content){
        if(root==null){
            return false;
        }
        return root.contains(content);
    }

    public boolean isFull(){
        if(root==null){
            return false;
        }
        return root.isFull();
    }



}
