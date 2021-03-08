package com.silentsunshine.lib;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/3/8 - 03 - 08 - 7:50
 * @description practice com.silentsunshine.lib
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
