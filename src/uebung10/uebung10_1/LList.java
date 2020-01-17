package uebung10.uebung10_1;

import java.util.Iterator;


public class LList implements Iterable<Node> {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(Object content) {
        Node node = new Node();
        node.setContent(content);

        if (head == null) {
            head = node;
        } else {

            Node currentNode = head;

            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }

            currentNode.setNextNode(node);
            node.setPreviousNode(currentNode);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        } else {

            int length = 1;
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
                length++;
            }
            return length;

        }
    }

    public Object get(int index) {

        if (index == 0) {
            return head.getContent();
        } else {
            Node currentNode = head;

            for (int i = 0; i < index; i++) {

                currentNode = currentNode.getNextNode();
            }

            return currentNode.getContent();
        }
    }

    public void remove(int index) {

        if (index == 0) {

            head = head.getNextNode();

        } else {
            Node currentNode = head;

            for (int i = 0; i < index; i++) {

                currentNode = currentNode.getNextNode();
            }

            currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());
            if (currentNode.getNextNode() != null) {
                currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
            }
        }
    }


    //Exercise 1
    public boolean contains(Object object) {

        boolean isInList = false;

        Node currentNode = head;

        while (currentNode.getNextNode() != null) {

            if (currentNode.getContent() == object) { //equals as alternative
                isInList = true;
            }
            currentNode = currentNode.getNextNode();
        }
        if (currentNode.getContent() == object) {
            isInList = true;
        }
        return isInList;
    }


    //Exercise 2
    public void put(int index, Object object) {

        Node currentNode = head;

        for (int i = 0; i <= index; i++) {
            if(i==index){
                currentNode.setContent(object);
            }else if (currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }else {
                System.out.println("Liste hat nur " + (i + 1) +" Elemente!");
                return;
            }
        }
    }


    //Exercise 3
    public void insert(int index, Object object) {

        Node currentNode = head;
        Node newNode = new Node();
        newNode.setContent(object);

        if (index==0) {
            head = newNode;
            currentNode.setPreviousNode(newNode);
            newNode.setNextNode(currentNode);
        }

        for (int i = 0; i <= index; i++) {
            if(i==index){
                currentNode.getPreviousNode().setNextNode(newNode);
                newNode.setPreviousNode(currentNode.getPreviousNode());
                newNode.setNextNode(currentNode);
                currentNode.setPreviousNode(newNode);
            }else if (currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }else {
                System.out.println("Liste hat nur " + (i+1) +" Elemente!");
                return;
            }
        }
    }


    //Exercise 4
    public boolean remove(Object object){

        boolean isRemoved = false;

        Node currentNode = head;


        //if object is headnode
        if (currentNode.getContent()==object){
            head = currentNode.getNextNode();
            return true;
        }

        //if object is in the middle
        while (currentNode.getNextNode()!=null){

            if (currentNode.getContent() == object) {
                currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());
                currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
                return true;
            }
            currentNode = currentNode.getNextNode();
        }

        //if object is last element
        if (currentNode.getContent()==object){
            currentNode.getPreviousNode().setNextNode(null);
            isRemoved=true;
        }
        return isRemoved;
    }

    @Override
    public Iterator<Node> iterator() {
        return new LListIterator(head);
    }


    public static class LListIterator implements Iterator<Node> {

        private Node currentNode;

        public LListIterator(Node currentNode) {
            super();
            Node emptyNode = new Node();
            emptyNode.setNextNode(currentNode);
            this.currentNode = emptyNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode.getNextNode() != null;
        }

        @Override
        public Node next() {
            currentNode = currentNode.getNextNode();
            return currentNode;
        }
    }
}