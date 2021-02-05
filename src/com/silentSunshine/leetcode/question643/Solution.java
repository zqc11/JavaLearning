package com.silentsunshine.leetcode.question643;

import java.util.Arrays;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 20:39
 * @description practice com.silentsunshine.leetcode.question643
 */
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (k==1) {
            return Arrays.stream(nums).max().getAsInt();
        }
        int maxSum;
        int temp;
        temp = Arrays.stream(Arrays.copyOfRange(nums, 0, k)).sum();
        maxSum = temp;
        for (int i = 1; i <= nums.length - k; i++) {
            temp = temp - nums[i-1] + nums[i+k-1];
            if (temp > maxSum) {
                maxSum = temp;
            }
        }
        return ((double)maxSum)/k;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMaxAverage(new int[]{0,1,1,3,3}, 4));
    }
}
