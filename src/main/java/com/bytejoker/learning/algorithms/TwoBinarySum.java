package com.bytejoker.learning.algorithms;

import java.util.Arrays;

// Ex 2.1-5
// Cormen 4-th Edition
public class TwoBinarySum {
    public static int[] sum(int[] a, int[] b) {
        int arraySize;
        if ((arraySize = a.length) != b.length) {
            throw new IllegalArgumentException("Размеры массивов не совпадают");
        }
        int[] c = new int[arraySize + 1];
        int carry = 0;
        for (int i = arraySize - 1; i >= 0; i--) {
            if ((a[i] == 0) == (a[i] == 1) || (b[i] == 0) == (b[i] == 1)) {
                throw new IllegalArgumentException("В массиве должны быть только цифры 0 или 1");
            }
            c[i + 1] = (a[i] + b[i] + carry) % 2;
            carry = (a[i] + b[i] + carry) / 2;
        }
        c[0] = carry;
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 1, 0, 0, 1};
        int[] b = {1, 1, 0, 0, 1, 0, 1, 0};
        System.out.println("   " + Arrays.toString(a));
        System.out.println("   " + Arrays.toString(b));
        System.out.println(Arrays.toString(sum(a, b)));
    }
}
