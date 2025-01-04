package org.dsa;

import org.dsa.arrays.searching.linear.LinearSearch;

import java.io.IOException;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] array = IntStream.range(0, 100).toArray();
        int element = 1000;
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.search(array, element);
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}