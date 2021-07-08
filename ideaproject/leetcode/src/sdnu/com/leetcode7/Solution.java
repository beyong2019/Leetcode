package sdnu.com.leetcode7;

/**
 * Integer inversion
 *
 * @author Beyong
 * @date 2021/05/20 23:28
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(120));
    }

    /**
     *
     * @author Beyong
     * @date 2021/05/20 23:42
     * @param x
     * @return int
     */

    public static int reverse(int x) {
        int result = 0;
        while(x != 0){
            int tempInteger = x % 10;
            if(result > 214748364 || (result == 214748364 && tempInteger > 7)){
                return 0;
            } else if (result < -214748364 || (result == -214748364 && tempInteger < -8)){
                return 0;
            }
            x /= 10;
            result = result * 10 + tempInteger;
        }
        return result;
    }
}


