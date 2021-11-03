package com.company;

public class Main {

    public static void main(String[] args) {
        MinimumElement minimumElement = new MinimumElement();
        int elements = minimumElement.readInteger();
        int[] numbers = minimumElement.readElements(elements);
        System.out.println("Minimum value = " + minimumElement.findMin(numbers));
    }
}
