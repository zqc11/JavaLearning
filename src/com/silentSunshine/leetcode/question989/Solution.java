package com.silentsunshine.leetcode.question989;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @auther zhouqichun
 * @date 2021/1/22 - 01 - 22 - 15:27
 * @description practice com.silentsunshine.common.string
 */
public class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        for (int i = 0; i < A.length; i++) {
            A[i] += 48;
        }
        BigInteger bigInteger = new BigInteger(new String(A, 0, A.length));
        char[] chars = bigInteger.add(BigInteger.valueOf(K)).toString().toCharArray();
        ArrayList arrayList = new ArrayList<Integer>();
        for (char a :
                chars) {
            arrayList.add(((int)a)-48);
        }
        return arrayList;
    }
    public static void main(String[] args) throws Exception {
        ArrayList arrayList = (ArrayList) new Solution().addToArrayForm(new int[]{1,2,3}, 45);
        System.out.println(arrayList.get(2));
    }
}
