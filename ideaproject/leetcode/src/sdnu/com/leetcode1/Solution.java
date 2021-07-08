package sdnu.com.leetcode1;

/**
 * Leetcode 1
 *
 * @author Beyong
 * @date 2021/05/13 15:12
 **/
public class Solution {
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] array = twoSum(nums, target);
        for(int i=0; i<2; i++){
            System.out.print(array[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


