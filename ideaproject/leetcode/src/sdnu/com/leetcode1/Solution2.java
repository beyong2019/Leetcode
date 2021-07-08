package sdnu.com.leetcode1;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 1
 *
 * @author Beyong
 * @date 2021/05/13 16:12
 **/
public class Solution2 {
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] array = twoSum2(nums, target);
        for(int i=0; i<2; i++){
            System.out.print(array[i]);
        }
    }
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> hashMap = new HashMap<>(nums.length - 1);
        hashMap.put(nums[0], 0);
        for(int i=1; i<nums.length; i++){
            int another = target - nums[i];
            if(hashMap.containsKey(another)){
                return new int[]{i, hashMap.get(another)};
            }
            hashMap.put(nums[i], i);
        }
       throw new IllegalArgumentException("No two sum solution");
    }
}


