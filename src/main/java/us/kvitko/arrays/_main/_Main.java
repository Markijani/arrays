package us.kvitko.arrays._main;


import us.kvitko.arrays.util.ArraysOperator;
import us.kvitko.arrays.util.Sorter;


public class _Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int[] arr1 = new int[]{2, -3, 1, 1};
        ArraysOperator.setTotal(arr);
        ArraysOperator.countEvenNumbers(arr);
        ArraysOperator.countOddNumbers(arr);
        ArraysOperator.countPrimeNumbers(arr);
        ArraysOperator.calcSubtractEvenOdd(arr);
        ArraysOperator.calcZero(arr);
        Sorter.sortArray(arr1);
    }
}

