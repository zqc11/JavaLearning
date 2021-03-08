package com.silentsunshine.everyday;

import com.silentsunshine.lib.TreeNode;

import java.util.HashMap;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/3/6 - 03 - 06 - 14:17
 * @description practice com.silentsunshine.everyday
 */
public class Day01 {
    public void traverseByMorris(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left == null) {
                //do something with current node
                System.out.println(current.val);
                current = current.right;
            } else {
                TreeNode previous = current.left;
                while (previous.right != null && previous.right != current) {
                    previous = previous.right;
                }
                if (previous.right == null) {
                    previous.right = current;
                    current = current.left;
                } else {
                    //do something with current node
                    System.out.println(current.val);
                    previous.right = null;
                    current = current.right;
                }
            }
        }
    }

    public void traverse(TreeNode root) {
        //前序遍历
        traverse(root.left);
        //中序遍历
        traverse(root.right);
        //后序遍历
    }

    public String slideWindow(String s,  String t) {
        HashMap<String, Integer> windows = new HashMap<>();
        HashMap<String, Integer> needs = new HashMap<>();
        for (char c : t.toCharArray()) {
            String ch = String.valueOf(c);
            needs.put(ch, needs.getOrDefault(ch, 0) + 1);
        }
        int left=0, right=0;
        int valid = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            String ch = String.valueOf(s.charAt(right++));
            if (needs.containsKey(ch)) {
                windows.put(ch, windows.getOrDefault(ch, 0)+1);
                if (windows.get(ch).equals(needs.get(ch))) {
                    valid++;
                }
            }
            //do something with windows

            while (valid == needs.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                String ch2 = String.valueOf(s.charAt(left++));
                if (needs.containsKey(ch2)) {
                    if (windows.get(ch2).equals(needs.get(ch2))) {
                        valid--;
                    }
                    windows.put(ch2, windows.get(ch2)-1);
                }

                //do something with windows
            }
        }
        return len==Integer.MAX_VALUE ? "":s.substring(start, len);
    }

    public void backtrack() {
        /*
        if 结束条件:
            res.add(track);
        for 选择 in 选择列表:
            做选择
            backtrack(路径, 选择列表);
            撤销选择;
         */
    }

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) >> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int leftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) >> 1;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    public int rihgtBOund(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) >> 1;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
