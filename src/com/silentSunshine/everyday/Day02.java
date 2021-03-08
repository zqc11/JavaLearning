package com.silentsunshine.everyday;


import com.silentsunshine.lib.LinkedNode;
import com.silentsunshine.lib.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/3/7 - 03 - 07 - 7:45
 * @description practice com.silentsunshine.everyday
 */
public class Day02 {
    public int binarysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)>>1;
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

    public int rightBound(int[] nums, int target) {
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

    public void traverse(TreeNode root) {
        //前序遍历
        traverse(root.left);
        //中序遍历
        traverse(root.right);
        //后序遍历
    }

    public void MorrisTraverse(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left == null) {
                //do something with current
                System.out.println(current.val);
                current = current.right;
            } else {
                TreeNode prev = current.left;
                while (prev.right != null && prev.right != current) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = current;
                    current = current.left;
                } else {
                    //do something with current
                    System.out.println(current.val);
                    prev.right = null;
                    current = current.right;
                }
            }
        }
    }

    public void backtrack(ArrayList<Integer> trace) {
        /*
        if 满足结束条件:
            res.add(trace);
            return;
        for 选择 in 选择列表:
            做选择
            backtrack(路径, 选择列表);
            撤销选择;
         */
    }

    public boolean hasLoop(LinkedNode root) {
        LinkedNode slow=root;
        LinkedNode fast=root;
        while (fast!=null&&fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public LinkedNode findNode(LinkedNode head) {
        LinkedNode slow = head;
        LinkedNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public int BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        int step = 0;
        queue.offer(root);
        visited.add(root);
        while (! queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = queue.poll();
                //如果到达终点, 返回step;

                //找到邻居, 判断是否访问过, 没有则添加到queue和visited
            }
            step++;
        }
        return step;
    }
}
