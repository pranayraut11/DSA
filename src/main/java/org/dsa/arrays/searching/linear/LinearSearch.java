package org.dsa.arrays.searching.linear;

import org.dsa.arrays.searching.Search;

public class LinearSearch  implements Search {
    @Override
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
