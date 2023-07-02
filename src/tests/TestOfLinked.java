package tests;

import collections.MyLinkedList;
import collections.MyList;

public class TestOfLinked {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();

        list.add("first");
        list.add("second");
        list.add("third");

        int size = list.size();
        if ( size == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        if( list.get(1) == "second") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        list.set(1,"dva");
        if ( list.get(1) == "dva") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        list.remove(2);
        size = list.size();
        if (size == 2) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        list.add("fourth");
        size = list.size();
        if ( size == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
