package arrays.sorting;

import org.dsa.arrays.sorting.Sort;
import org.dsa.arrays.sorting.selectionsort.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortJunitTest {

    Sort sort = new SelectionSort();

    @Test
    void sortRandomArray() {
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(randomIntsArray));
        int[] sortedArray = sort.sort(randomIntsArray);
        System.out.println("Array after selection sorting");
        System.out.println(Arrays.toString(sortedArray));
        Arrays.sort(randomIntsArray);
        System.out.println("Original array after java lib sorting");
        Arrays.sort(randomIntsArray);
        System.out.println(Arrays.toString(randomIntsArray));
        assertArrayEquals(randomIntsArray, sortedArray, "Array is sorted");
    }
}
