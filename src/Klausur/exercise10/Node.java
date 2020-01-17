package Klausur.exercise10;

public class Node {

        private int content;
        private Node left;
        private Node right;

        public Node(int content) {
            this.content = content;
        }

        public void insert(int content) {

            if(content < this.content) {
                if(left==null) {
                    Node node = new Node(content);
                    left = node;
                }else {
                    left.insert(content);
                }
            }else if(content> this.content) {
                if(right==null) {
                    Node node = new Node(content);
                    right = node;
                }else {
                    right.insert(content);
                }
            }
        }

        public int size() {
            int size = 1;

            if(left!=null) {
                size+=left.size();
            }
            if(right!=null) {
                size+=right.size();
            }

            return size;
        }
    }

