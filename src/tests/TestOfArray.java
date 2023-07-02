package tests;

import java.util.LinkedList;

public class TestOfArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        int size = list.size();
        if(size == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        if (list.get(1) == "second") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        list.remove(2);
        size = list.size();
        if ( size == 2) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        list.add(2, "third");
        if (list.get(2) == "third") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        list.set(0, "zero");
        if (list.get(0) == "zero") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}