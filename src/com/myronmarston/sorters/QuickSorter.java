package com.myronmarston.sorters;

/**
 *
 * @author myron
 */
public class QuickSorter<T extends  Comparable<T>> {
    public T[] sort(T[] unsortedArray) {
        T[] array = unsortedArray.clone();
        quickSort(array, 0, unsortedArray.length - 1);
        return array;
    }

    private void quickSort(T[] array, int minIndex, int maxIndex) {
        if (maxIndex <= minIndex || maxIndex > array.length - 1 || minIndex < 0) {
            return;
        }

        int origMinIndex = minIndex;
        int origMaxIndex = maxIndex;

        T pivotValue = array[origMinIndex];

        while (minIndex < maxIndex) {
            while (minIndex <= maxIndex && array[minIndex].compareTo(pivotValue) <= 0) {
                minIndex++;
            }

            while (maxIndex > minIndex && array[maxIndex].compareTo(pivotValue) > 0) {
                maxIndex--;
            }

            if (minIndex < maxIndex) {
                swap(array, minIndex, maxIndex);
            }
        }

        int finalPivotIndex = minIndex - 1;
        swap(array, finalPivotIndex, origMinIndex);

        quickSort(array, origMinIndex, finalPivotIndex - 1);
        quickSort(array, finalPivotIndex + 1, origMaxIndex);
    }

    private void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
