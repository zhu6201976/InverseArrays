package com.example.javatest;


import java.util.Arrays;

/**
 * 将一个数组中的数逆序重新存放。
 */
public class Test {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length / 2; i++) {
            numbers[i] = numbers[i] + numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = numbers[i] - numbers[numbers.length - 1 - i];
            numbers[i] = numbers[i] - numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(numbers));
    }


}

