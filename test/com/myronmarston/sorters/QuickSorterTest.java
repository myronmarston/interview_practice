package com.myronmarston.sorters;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author myron
 */
public class QuickSorterTest {
    @Test
    public void sortList() throws Exception {
         Integer[] unsortedArray = new Integer[]{7, 23, 9, 4, 1, 67, 234, 23, 3, 6, 1};
         Integer[] expectedSortedArray = new Integer[]{1, 1, 3, 4, 6, 7, 9, 23, 23, 67, 234};

         QuickSorter<Integer> sorter = new QuickSorter<Integer>();

         Integer[] actualSortedArray = sorter.sort(unsortedArray);
         assertArrayEquals(expectedSortedArray, actualSortedArray);
    }
}
