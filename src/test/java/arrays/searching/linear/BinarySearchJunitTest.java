package arrays.searching.linear;


import org.dsa.arrays.searching.Search;
import org.dsa.arrays.searching.binarysearch.BinarySearch;
import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchJunitTest {

     Search search = new BinarySearch();
    @Test
    void elementFound(){
        int[] array = IntStream.range(1,100).toArray();
        int index = search.search(array,4);
        assertEquals(3,index,"Element found at index");
    }

    @Test
    void elementNotFound(){
        int[] array = IntStream.range(1,100).toArray();
        int index = search.search(array,400);
        assertEquals(-1,index,"Element not found at index");
    }

    @Test
    void elementNotFoundForNullInput(){
        int index = search.search(null,400);
        assertEquals(-1,index,"Element not found for null array");
    }
}
