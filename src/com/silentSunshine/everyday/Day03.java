package com.silentsunshine.everyday;

import com.silentsunshine.lib.LinkedNode;
import com.silentsunshine.lib.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/3/8 - 03 - 08 - 7:49
 * @description practice com.silentsunshine.everyday
 */
public class Day03 {
    public boolean hasLoop3(LinkedNode root) {
        LinkedNode slow = root;
        LinkedNode fast = root;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void traverse3(TreeNode root) {
        //前序遍历
        traverse3(root.left);
        //中序遍历, 二叉搜索树的中序遍历为升序
        traverse3(root.right);
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
                while (prev != null && prev != current) {
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

    public int BFS(int[][] nums, int target) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int step = 0;
        queue.add(nums[0][0]);
        visited.add(nums[0][0]);
        while (! queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                int current = queue.poll();
                if (current == target) {
                    return step;
                }
                /*
                int[] neibors = getNeibors(current);
                for(int neibor: neibors){
                    if(!visited.contains(neibor))
                        queue.add(neibor);
                        visited.add(neibor);
                }
                 */
            }
            step++;
        }
        return -1;
    }

    public void slideTo(String s, String t) {
        HashMap<String, Integer> needs = new HashMap<>();
        HashMap<String, Integer> windows = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            needs.put(String.valueOf(t.charAt(i)), needs.getOrDefault(String.valueOf(t.charAt(i)), 0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        while (right < s.length()) {
            String s1 = String.valueOf(s.charAt(right++));
            if (needs.containsKey(s1)) {
                windows.put(s1, windows.getOrDefault(s1, 0) + 1);
                if (windows.get(s1).equals(needs.get(s1))) {
                    valid++;
                }
            }
            while (valid == needs.size()) {
                //此处判断是否满足题目条件, 作相应处理

                s1 = String.valueOf(s.charAt(left++));
                if (needs.containsKey(s1)) {
                    if (windows.get(s1).equals(needs.get(s1))) {
                        valid--;
                    }
                    windows.put(s1, windows.get(s1) - 1);
                }
            }
        }
    }
}
