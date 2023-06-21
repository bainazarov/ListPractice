package tests;

import collections.MyLinkedList;
import collections.MyList;

public class TestOfLinked {
    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        int size = myLinkedList.size();
        if(size == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        if (myLinkedList.get(2) == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test filed");
        }

        myLinkedList.set(0,0);
        if (myLinkedList.get(0) == 0) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        myLinkedList.add(1,3);
        if (myLinkedList.get(1) == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
