package collections;

public interface myTree<E> extends Comparable<E> {
    void add(int value);
    void remove(int value);
    void printTreeWigth();
    void printTreeDeep(BinaryTree.Node node);
}
