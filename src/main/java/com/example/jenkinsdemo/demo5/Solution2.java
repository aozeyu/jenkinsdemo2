package com.example.jenkinsdemo.demo5;

import java.util.HashSet;
import java.util.Set;

//查找数组重复数据
public class Solution2 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num:nums) {
            if(!set.add(num)) {
                return num;
            }
        }
        return 0;
    }
}
