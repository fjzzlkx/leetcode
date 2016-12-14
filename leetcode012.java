package leetcode;
import java.util.Map;
import java.util.HashMap;
public class Test {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();//获取当前时间
        Solution s = new Solution();
        String ss = "";
        ss = s.intToRoman(3999);
        System.out.println(ss);
        System.out.println("over");
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startTime)+"ms");
    }
}
class Solution {
    public String intToRoman(int num) {
        int [] A = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int [] numOfA = new int[13];
        for(int i = 0; i < 13; i++){
            numOfA[i] = num / A[i];
            num = num % A[i];
        }
        Map<Integer,String> romanMap = new HashMap<>();
        romanMap.put(12, "I");
        romanMap.put(11, "IV");
        romanMap.put(10, "V");
        romanMap.put(9, "IX");
        romanMap.put(8, "X");
        romanMap.put(7, "XL");
        romanMap.put(6, "L");
        romanMap.put(5, "XC");
        romanMap.put(4, "C");
        romanMap.put(3, "CD");
        romanMap.put(2, "D");
        romanMap.put(1, "CM");
        romanMap.put(0, "M");
        StringBuilder s = new StringBuilder();
        for(int i =0; i < 13; i++){
            while(numOfA[i] > 0){
                s  = s.append(romanMap.get(i));
                numOfA[i]--;
            }
        }
        return s.toString();    
    }
}






