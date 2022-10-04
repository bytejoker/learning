package com.bytejoker.learning.algorithms.sort.selectionsort;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    private static void swap(int firstIndex, int secondIndex, int[] array) {
        int temp = array[secondIndex];
        array[secondIndex] = array[firstIndex];
        array[firstIndex] = temp;
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            swap(i, currentMinIndex, array);
        }
        return array;
    }

    public static void main(String[] args) {
        int ARRAY_SIZE = 40000;
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(ARRAY_SIZE);
        }
        LocalTime timeBefore = LocalTime.now();
        System.out.println("Start sorting");
        System.out.println("Array before sorting: " + Arrays.toString(array));
        sort(array);
        LocalTime timeAfter = LocalTime.now();
        System.out.println("Finish sorting");
        System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println("Time :" + (timeAfter.getSecond() - timeBefore.getSecond()));
    }
}
