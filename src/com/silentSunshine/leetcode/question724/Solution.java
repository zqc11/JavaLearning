package com.silentsunshine.leetcode.question724;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/28 - 01 - 28 - 16:48
 * @description practice com.silentsunshine.leetcode.question724
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 1;
        }
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        if (rightSum == 0) {
            return 0;
        }
        int leftSum = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i-1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
