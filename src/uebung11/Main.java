package uebung11;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(3);
        bst.insert(1);
        bst.insert(7);
        //bst.insert(2);
        //bst.insert(4);
        //bst.insert(6);
        //bst.insert(0);

        System.out.println(bst.size());

        //System.out.println(bst.contains(6));

        System.out.println(bst.isFull());




    }
}
