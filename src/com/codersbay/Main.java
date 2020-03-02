package com.codersbay;

public class Main {

    public static void main(String[] args) {
        System.out.println("Divide and conquer!");

        int[] array = {7, 45, -234, 876, 46, 0, -2, 17};
        System.out.println(findMaximum(array));

    }

    private static int findMaximum(int[] array) {
        if (array.length > 2) {
            int middle = array.length / 2;
            int[] leftSide = new int[middle];
            int[] rightSide = new int[array.length - middle];
            for (int i = 0; i < middle; i++) {
                leftSide[i] = array[i];
            }
            int left = findMaximum(leftSide);

            for (int i = middle; i < array.length; i++) {
                rightSide[i - middle] = array[i];
            }
            int right = findMaximum(rightSide);
            return left > right ? left : right;
        } else if (array.length == 2) {
            return array[0] > array[1] ? array[0] : array[1];
        } else {
            return array[0];
        }

    }
}
