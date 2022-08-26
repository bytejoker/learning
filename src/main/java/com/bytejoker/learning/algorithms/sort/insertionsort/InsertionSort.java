package com.bytejoker.learning.algorithms.sort.insertionsort;

import jdk.jfr.Label;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class InsertionSort {

    private static void swap(int firstIndex, int secondIndex, int[] array) {
        int temp = array[secondIndex];
        array[secondIndex] = array[firstIndex];
        array[firstIndex] = temp;
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(j, j - 1, array);
                j--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int ARRAY_SIZE = 200000;
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(ARRAY_SIZE);
        }
        LocalTime timeBefore = LocalTime.now();
        System.out.println("Start sorting");
        Arrays.sort(array);
        LocalTime timeAfter = LocalTime.now();
        System.out.println("Finish sorting");
        System.out.println("Time :" + (timeAfter.getSecond() - timeBefore.getSecond()));
    }
}
