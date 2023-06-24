package collections;

public class MyLinkedList <T> implements MyList {
    private Node first;
    private Node last;
    int size = 0;
    private class Node {
        Node prev;
        Node next;
        T value;
        public Node () {
            this.value = value;
            this.prev = prev;
            this.next = next;

        }
        public Node(Node p, Node next, Object element) {

        }
    }

    private boolean isPositionIndex(int index) {//+
        return index >= 0 && index <= size;
    }

    private void checkPositionIndex(int index) {//+
        if (!isPositionIndex(index)) {
            System.out.println("Несуществующий индекс ");
        }
    }
    @Override
    public boolean add(Object e) {
        final Node l = last;
        final Node newNode = new Node();
        last = newNode;
        if(l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        return false;
    }
    public void add(int index, T value) {
        Node newNode = new Node();

}

    @Override
    public void set(int index, Object element) {
        checkPositionIndex(index);
        Node x = node(index);
        T oldVal = x.value;
        x.value = (T) element;
    }
    @Override
    public T remove(int index) {
            Node x = node(index);
            Node n = x.next;
            Node p = x.prev;
            if (index == 0) {
                n.prev = null;
                first = n;
                } else if (index == (size - 1)) {
                    p.next = n;
                    last = p;
                } else {
                n.prev = p;
                p.next = n;
                size--;
            }
        return (T) x.value;
    }
    Node node(int index) {
    if (index < (size >> 1)) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    } else {
        Node x = last;
        for (int i = size - 1; i > index; i--) {

            x  = x.prev;
        }
        return x;
    }
}
    @Override
    public int size() {
        return size;
    }
    @Override
    public T get(int index) {
        checkPositionIndex(index);
        return (T) node(index).value;
    }
}
