package com.example.jenkinsdemo.demo6;

/**
 * @author yaozeyu
 */
public class Solution2 {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, temp;
        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) {
                i++;
            }
            while (i<j && (nums[i] & 1) == 0) {
                j --;
            }
            // 中间值
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return  nums;
    }
}
