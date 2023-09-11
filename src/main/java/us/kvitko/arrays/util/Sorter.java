package us.kvitko.arrays.util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorter {

    public static void sortArray(int [] arr1) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    isSorted = false;
                    buf = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}







