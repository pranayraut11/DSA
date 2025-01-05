package org.dsa.arrays.searching.twopointerstechnique;

import org.dsa.arrays.searching.Search;

public class TwoPointersTechnique implements Search {
    @Override
    public int search(int[] array, int element) {

        if(array == null || array.length == 0){
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int sum = array[low] + array[high];
            if (sum == element) {
                return 1;
            }else if(sum > element ){
                high--;
            } else {
                low++;
            }
        }

        return -1;
    }
}
