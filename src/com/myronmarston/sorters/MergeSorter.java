package com.myronmarston.sorters;

import java.util.*;

/**
 *
 * @author myron
 */
public class MergeSorter<T extends Comparable<T>> {
    public List<T> sort(List<T> unsortedList) {
        if (unsortedList.size() < 2) {
            return unsortedList;
        }

        int splitIndex = (unsortedList.size() / 2);
        List<T> unsortedListHalf1 = unsortedList.subList(0, splitIndex);
        List<T> unsortedListHalf2 = unsortedList.subList(splitIndex, unsortedList.size());

        List<T> sortedListHalf1 = sort(unsortedListHalf1);
        List<T> sortedListHalf2 = sort(unsortedListHalf2);

        return merge(sortedListHalf1, sortedListHalf2);
    }

    private List<T> merge(List<T> sortedList1, List<T> sortedList2) {
        List<T> mergedList = new ArrayList<T>();

        ListIterator<T> iterator1 = sortedList1.listIterator();
        ListIterator<T> iterator2 = sortedList2.listIterator();

        ListIterator<T> nextValueIterator;

        while (iterator1.hasNext() || iterator2.hasNext()) {
            if (!iterator2.hasNext() || (iterator1.hasNext() && sortedList1.get(iterator1.nextIndex()).compareTo(sortedList2.get(iterator2.nextIndex())) <= 0)) {
                nextValueIterator = iterator1;
            } else {
                nextValueIterator = iterator2;
            }

            mergedList.add(nextValueIterator.next());
        }

        return mergedList;
    }
}
