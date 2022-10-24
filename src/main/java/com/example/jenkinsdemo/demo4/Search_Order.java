package com.example.jenkinsdemo.demo4;

import java.util.Arrays;

public class Search_Order {
    public static void main(String[] args) {
        int[] test1 = { 0, 1, 2, 3, 4 };
        int[] test2 = { 9, 7, 2, 1, 7 };
        int[] test3 = { 3, 1, 6, 3, 9 };
        System.out.println(Arrays.toString(test1));
        System.out.println(test1.length);
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));

        System.out.println(Arrays.binarySearch(test1, 1));
        Arrays.sort(test2); // 排序
        System.out.println(Arrays.binarySearch(test2, 1));
        Arrays.sort(test3);
        System.out.println(Arrays.binarySearch(test3, 1));
    }
}
