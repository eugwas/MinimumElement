package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        System.out.println("How many elements will be entered?");
        int elements = scanner.nextInt();
        return elements;
    }

    public static int[] readElements(int number) {
        System.out.println("Enter " + number + " int numbers: ");
        int[] numbers = new int[number];
        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }

    public static int findMin(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        int minValue = sortedArray[0];
        return minValue;
    }

}
