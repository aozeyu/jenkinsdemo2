package com.example.jenkinsdemo.demo2;

import com.jayway.jsonpath.internal.function.numeric.Max;

import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {
        int sum = 0;
        int[] leftaar = new int[ratings.length];
        int[] righaar = new int[ratings.length];
        Arrays.fill(leftaar, 1); // 用1填充左边数组
        Arrays.fill(righaar,1);
        for (int i = 1; i< ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                // 当前孩子的评级大于上一个
                leftaar[i] = leftaar[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i + 1]) {
                //当前评级大于下一个
                righaar[i] = righaar[i+1] + 1;
            }
        }
        for (int i = 0; i< ratings.length; i ++) {
            sum += Math.max(leftaar[i], righaar[i]); // 取最大值
        }
        return  sum; //返回需要的最小糖果数
    }
}
