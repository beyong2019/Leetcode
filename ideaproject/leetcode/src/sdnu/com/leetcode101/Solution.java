package sdnu.com.leetcode101;
import java.util.ArrayList;

/**
 * @author Beyong
 * @Description ¶Ô³Æ¶þ²æÊ÷---µü´ú
 * @date 2021/05/21 22:58
 */

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode tempLeft = queue.remove(0);
            TreeNode tempRight = queue.remove(1);
            if(tempLeft == null && tempRight == null){ continue;}
            if(tempLeft == null || tempRight == null || tempLeft.val != tempRight.val){
                return false;
            }
            queue.add(tempLeft.left);
            queue.add(tempRight.right);
            queue.add(tempLeft.right);
            queue.add(tempRight.left);
        }
        return true;
    }
}


