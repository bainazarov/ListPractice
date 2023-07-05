package collections;

public interface MyTree<T> extends Comparable<T> {
    void add(int value);
    void remove(int value);
    void printTreeDepth();
    void printTreeWidth();
}
