package com.silentsunshine.leetcode.question1232;

/**
 * 在一个XY 坐标系中有一些点，我们用数组coordinates来分别记录它们的坐标，其中coordinates[i] = [x, y]表示横坐标为 x、纵坐标为 y的点。
 *
 * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-it-is-a-straight-line
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        //比较斜率相等即可
        for (int i = 1; i < coordinates.length - 1; i++) {
            int deltaY1 = coordinates[i][1] - coordinates[i-1][1];
            int deltaX1 = coordinates[i][0] - coordinates[i-1][0];
            int deltaY2 = coordinates[i][1] - coordinates[i-1][1];
            int deltaX2 = coordinates[i][0] - coordinates[i-1][0];
            if (deltaY1 * deltaX2 == deltaY2 * deltaX1)
                continue;
            return false;
        }
        return true;
    }
}
