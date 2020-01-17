package uebung9.uebung9_2;

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

    public Object get(int index) throws ListToSmallException {

        if (size() <= index) {
            throw new ListToSmallException("List too small");
        }


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

    public void remove(int index) throws ListToSmallException {

        if (size() <= index) {
            throw new ListToSmallException("List too small");
        }

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
