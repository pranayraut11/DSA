package org.dsa.arrays.searching.binarysearch;

import org.dsa.arrays.searching.Search;


public class BinarySearch implements Search {

    @Override
    public int search(int[] array, int element) {

        int hight = 0;
        int low = 0;
        if(array !=null && array.length>0) {
            hight = array.length-1;
            while (low <= hight ) {
                int mid = low + (hight - low)/2;
                if ( array[mid] == element) {
                    return mid;
                } else if (array[mid] > element) {
                    hight = mid-1;
                } else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
