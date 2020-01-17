package uebung7.uebung7_5;

public class Node<C> {

    private Node<C> nextNode;
    private Node<C> previousNode;
    private Object content;

    public Node<C> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node<C> nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
    public Node<C> getPreviousNode() {
        return previousNode;
    }
    public void setPreviousNode(Node<C> previousNode) {
        this.previousNode = previousNode;
    }

}
