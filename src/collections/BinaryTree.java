package collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree implements myTree{
    Node root;
    public class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
    private Node add (Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        } else {
            return current;
        }
        return current;
    }
    @Override
    public void add(int value) {
        root = add(root, value);
    }
    private Node remove(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value)
            if (value < current.value) {
                current.left = remove(current.left, value);
                return current;
            }
            current.right = remove(current.right, value);
            return current;
        }
    @Override
    public void remove(int value) {
        root = remove(root,value);
    }

    @Override
    public void printTreeWigth() {
            if (root == null) {
                return;
            }
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(root);

            while (!nodes.isEmpty()) {

                Node node = nodes.remove();

                System.out.print(" " + node.value);

                if (node.left != null) {
                    nodes.add(node.left);
                }

                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
        }

    @Override
    public void printTreeDeep(Node node) {
        if (node != null) {
            printTreeDeep(node.left);
            System.out.print(" " + node.value);
            printTreeDeep(node.right);
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
