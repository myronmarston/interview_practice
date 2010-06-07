package com.myronmarston.sorters;

import org.junit.Test;
import org.junit.Assert;
import java.util.*;

/**
 *
 * @author myron
 */
public class MergeSorterTest {
    @Test
    public void sortList() throws Exception {
        List<Integer> unsortedList = Arrays.asList(new Integer[]{7, 23, 9, 4, 1, 67, 234, 23, 3, 6, 1});
        List<Integer> expectedSortedList = Arrays.asList(new Integer[]{1, 1, 3, 4, 6, 7, 9, 23, 23, 67, 234});

        MergeSorter<Integer> sorter = new MergeSorter<Integer>();

        List<Integer> actualSortedList = sorter.sort(unsortedList);
        for (int i = 0; i < unsortedList.size(); i++) {
            Assert.assertEquals(expectedSortedList.get(i), actualSortedList.get(i));
        }
    }
}
