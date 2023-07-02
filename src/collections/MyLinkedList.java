package collections;


public class MyLinkedList <T> implements MyList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;

    private static class Node<T> {
        private T value;
        private Node<T> prev;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = getNode(index);
        currentNode.value = value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = getNode(index);

        if (currentNode == head) {
            head = currentNode.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (currentNode == last) {
            last = currentNode.prev;
            if (last != null) {
                last.next = null;
            }
        } else {
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
        }
        size--;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = getNode(index);
        return currentNode.value;
    }

    private Node<T> getNode(int index) {
        Node<T> currentNode;
        if (index <= size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = last;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode;
    }
}
