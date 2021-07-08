package sdnu.com.leetcode13;

/**
 * leetcode13---罗马数字
 *
 * @author Beyong
 * @date 2021/05/15 15:32
 **/
public class Solution2 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int result = 0;
        int temp;
        int preNumber = getValue(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            temp = getValue(s.charAt(i));
            if(preNumber < temp){
                result -= preNumber;
            } else {
                result += preNumber;
            }
            preNumber = temp;
        }
        result += preNumber;
        return result;
    }
    public static int getValue(char s){
        switch(s){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }
}


