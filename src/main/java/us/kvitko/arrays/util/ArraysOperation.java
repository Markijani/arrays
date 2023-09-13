package us.kvitko.arrays.util;

public class ArraysOperation {

    public static void setTotal(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Sum numbers of array:" + " " + total);
    }

    public static void countEvenNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of even numbers:" + " " + count);
    }

    public static void countOddNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of odd numbers:" + " " + count);
    }

    public static void countPrimeNumbers(int[] arr) {
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println("Number of prime numbers:" + " " + count);
    }

    public static void calcSubtractEvenOdd(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {

                sum1 += arr[i];
            }
            if (i % 2 != 0) {
                sum2 += arr[i];
            }
        }
        System.out.println(sum1 - sum2);
    }

    public static void calcZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("The number 0 occurs:" + " " + count);
    }
}

