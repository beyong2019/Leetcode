package sdnu.com.leetcode13;

/**
 * leetcode13---first solution
 *
 * @author Beyong
 * @date 2021/05/15 11:33
 **/
class Solution {
    public static void main(String[] args){
        String s1 = "MCMXCIV";
        System.out.println(romanToInt(s1));
    }
    public static int romanToInt(String s) {
        int result=0;
        char[] array = s.toCharArray();
        int len = array.length;
        for(int i=0; i<len; i++){
            if(array[i] == 'I'){
                if(i+1<len){
                    if(array[i+1] == 'V'){
                        result += 4;
                        i++;
                        continue;
                    } else if(array[i+1] == 'X'){
                        result += 9;
                        i++;
                        continue;
                    } else {result += 1;}
                } else {
                    result += 1;
                }
            } else {

            }
            if(array[i] == 'V'){ result += 5; }
            if(array[i] == 'X'){
                if(i+1 < len){
                    if(array[i+1] == 'L'){
                        result += 40;
                        i++;
                        continue;
                    } else if(array[i+1] == 'C'){
                        result += 90;
                        i++;
                        continue;
                    } else {result += 10;}
                } else {
                    result += 10;
                }
            }
            if(array[i] == 'L'){ result += 50;}
            if(array[i] == 'C'){
                if(i+1 < len){
                    if(array[i+1] == 'D'){
                        result += 400;
                        i++;
                        continue;
                    } else if(array[i+1] == 'M'){
                        result += 900;
                        i++;
                        continue;
                    } else {result += 100;}
                } else {
                    result += 100;
                }
            }
            if(array[i] == 'D'){result += 500;}
            if(array[i] == 'M'){result += 1000;}
        }
        return result;
    }
}


