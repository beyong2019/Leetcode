package sdnu.com.leetcode101;

/**
 * @author Beyong
 * @Description ¶Ô³Æ¶þ²æÊ÷---µÝ¹éËã·¨
 * @date 2021/05/21 23:59
 */

public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    public boolean check(TreeNode leftTree, TreeNode rightTree){
        if(leftTree == null && rightTree == null){ return true; }
        if(leftTree == null || rightTree == null || leftTree.val != rightTree.val){
            return false;
        }
        return check(leftTree.left, rightTree.right) && check(leftTree.right, rightTree.left);
    }
}


