package us.kvitko.arrays.util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorter {

    public static void sortArray() {
        int[] arr = new int[] {2, -3, 1, 1};
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}







