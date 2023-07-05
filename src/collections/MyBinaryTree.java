package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyBinaryTree<T> implements MyTree<T> {
    Node root;

    public MyBinaryTree() {
        root = null;
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    @Override
    public void add(int value) {
        root = add(root, value);
    }

    private Node add(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        }
        return current;
    }

    @Override
    public void remove(int value) {
        root = deleteNode(root, value);
    }

    public Node deleteNode(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.right == null) {
                return current.left;
            } else if (current.left == null) {
                return current.right;
            } else {
                int smallValue = findSmallValue(current.right);
                current.value = smallValue;
                current.right = deleteNode(current.right, smallValue);
                return current;
            }
        }
        if (value < current.value) {
            current.left = deleteNode(current.left, value);
            return current;
        }
        current.right = deleteNode(current.right, value);
        return current;
    }

    private int findSmallValue(Node root) {
        if (root.left == null) {
            return root.value;
        } else {
            return findSmallValue(root.left);
        }
    }

    @Override
    public void printTreeDepth() {
        printDepth(root);
    }

    private void printDepth(Node current) {
        if (current == null) {
            return;
        }
            System.out.println(current.value + " ");
        printDepth(current.left);
        printDepth(current.right);
    }

    @Override
    public void printTreeWidth() {
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
