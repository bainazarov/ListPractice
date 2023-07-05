package tests;

import collections.MyBinaryTree;
import collections.MyTree;

public class TestOfTree {
    public static void main(String[] args) {
        MyTree<Integer> tree = new MyBinaryTree<>();

        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(9);
        tree.add(7);
        tree.add(5);

        System.out.println("Поиск в глубину");
        tree.printTreeDepth();

        System.out.println("Поиск в ширину");
        tree.printTreeWidth();

        System.out.println("Удаление значения 5");
        tree.remove(5);
        tree.printTreeWidth();
    }
}
