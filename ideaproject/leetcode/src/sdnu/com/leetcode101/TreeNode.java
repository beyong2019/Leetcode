package sdnu.com.leetcode101;

/**
 * @author Beyong
 * @Description Definition for a binary tree node
 * @date 2021/05/21 23:01
 */

public class TreeNode {
    int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
}


