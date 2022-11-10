package com.bytejoker.learning.algorithms.sort.mergesort;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    private static void merge(int[] array, int subArrayLeftBorder, int subArrayMidBorder, int subArrayRightBorder) {
        int[] leftSubArray = Arrays.copyOfRange(array, subArrayLeftBorder, subArrayMidBorder + 1);
        int[] rightSubArray = Arrays.copyOfRange(array, subArrayMidBorder + 1, subArrayRightBorder + 1);
        int currentElementIndex = subArrayLeftBorder;
        int leftSubArraySmallestRemainingElementIndex = 0;
        int rightSubArraySmallestRemainingElementIndex = 0;
        int leftSubArraySize = subArrayMidBorder - subArrayLeftBorder + 1;
        int rightSubArraySize = subArrayRightBorder - subArrayMidBorder;

        while (
                leftSubArraySmallestRemainingElementIndex < leftSubArraySize &&
                rightSubArraySmallestRemainingElementIndex < rightSubArraySize
        ) {
            if (leftSubArray[leftSubArraySmallestRemainingElementIndex] < rightSubArray[rightSubArraySmallestRemainingElementIndex]) {
                array[currentElementIndex] = leftSubArray[leftSubArraySmallestRemainingElementIndex];
                leftSubArraySmallestRemainingElementIndex++;
            } else {
                array[currentElementIndex] = rightSubArray[rightSubArraySmallestRemainingElementIndex];
                rightSubArraySmallestRemainingElementIndex++;
            }
            currentElementIndex++;
        }

        while (leftSubArraySmallestRemainingElementIndex < leftSubArraySize) {
            array[currentElementIndex] = leftSubArray[leftSubArraySmallestRemainingElementIndex];
            leftSubArraySmallestRemainingElementIndex++;
            currentElementIndex++;
        }

        while (rightSubArraySmallestRemainingElementIndex < rightSubArraySize) {
            array[currentElementIndex] = rightSubArray[rightSubArraySmallestRemainingElementIndex];
            rightSubArraySmallestRemainingElementIndex++;
            currentElementIndex++;
        }
    }

    public static int[] sort(int[] array, int subArrayLeftBorder, int subArrayRightBorder) {
        if (subArrayLeftBorder >= subArrayRightBorder) {
            return array;
        }
        int subArrayMidBorder = (subArrayRightBorder - subArrayLeftBorder) / 2 + subArrayLeftBorder;
        sort(array, subArrayLeftBorder, subArrayMidBorder);
        sort(array, subArrayMidBorder + 1, subArrayRightBorder);
        merge(array, subArrayLeftBorder, subArrayMidBorder, subArrayRightBorder);
        return array;
    }

    public static void main(String[] args) {
        int ARRAY_SIZE = 100000000;
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(ARRAY_SIZE);
        }
        LocalTime timeBefore = LocalTime.now();
        System.out.println("Start sorting");
        //System.out.println("Array before sorting: " + Arrays.toString(array));
        sort(array, 0 , array.length - 1);
        LocalTime timeAfter = LocalTime.now();
        System.out.println("Finish sorting");
        //System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println("Time :" + (timeAfter.getSecond() - timeBefore.getSecond()));

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(ARRAY_SIZE);
        }
        LocalTime timeBefore1 = LocalTime.now();
        System.out.println("Start sorting");
        //System.out.println("Array before sorting: " + Arrays.toString(array));
        Arrays.sort(array);
        LocalTime timeAfter1 = LocalTime.now();
        System.out.println("Finish sorting");
        //System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println("Time :" + (timeAfter1.toSecondOfDay() - timeBefore1.toSecondOfDay()));
    }
}
