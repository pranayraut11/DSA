package arrays.searching.linear;

import org.dsa.arrays.searching.Search;
import org.dsa.arrays.searching.twopointerstechnique.TwoPointersTechnique;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class TwoPointerTechniqueJunitTest {

    Search search = new TwoPointersTechnique();

    @Test
    void elementFound(){
        int[] array = {1,2,3,4,7,8,9,10};
        int index = search.search(array,19);
        assertEquals(1,index,"Any two digit sum is matching with target Element ");
    }

    @Test
    void elementNotFound(){
        int[] array = {1,2,3,4,7,8,9,10};
        int index = search.search(array,20);
        assertEquals(-1,index," Any two digit sum is not matching with target Element ");
    }

    @Test
    void elementNotFoundForNullArray(){
        int index = search.search(null,20);
        assertEquals(-1,index," Any two digit sum is not matching with target Element ");
    }
}
