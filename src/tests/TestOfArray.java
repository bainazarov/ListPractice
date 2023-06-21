package tests;
import collections.MyArrayListArray;

import java.util.LinkedList;

public class TestOfArray {
    public static void main(String[] args) {
        LinkedList<String> listOfArray = new LinkedList<>();
        listOfArray.add("first");
        listOfArray.add("second");
        listOfArray.add("third");

        int size = listOfArray.size();
        if(size == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        if (listOfArray.get(1) == "second") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        listOfArray.remove(2);
        size = listOfArray.size();
        if ( size == 2) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        listOfArray.add(2, "third");
        if (listOfArray.get(2) == "third") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        listOfArray.set(0, "zero");
        if (listOfArray.get(0) == "zero") {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}