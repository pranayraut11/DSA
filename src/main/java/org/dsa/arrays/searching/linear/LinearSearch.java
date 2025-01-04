package org.dsa.arrays.searching.linear;

public class LinearSearch {
    public int search(int[] array, int element) {
        if(array != null && array.length>0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }

}
