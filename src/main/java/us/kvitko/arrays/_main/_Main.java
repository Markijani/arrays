package us.kvitko.arrays._main;


import us.kvitko.arrays.util.ArraysOperation;
import us.kvitko.arrays.util.Sorter;


public class _Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
    ArraysOperation.setTotal(arr);
    ArraysOperation.countEvenNumbers(arr);
    ArraysOperation.countOddNumbers(arr);
    ArraysOperation.countPrimeNumbers(arr);
    ArraysOperation.findSubtractEvenOdd(arr);
    ArraysOperation.findNull(arr);
        int[] arr1 = new int[] {2, -3, 1, 1};
        Sorter.sortArray(arr1);
    }
}

