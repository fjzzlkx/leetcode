// 13. Roman to Integer
// Given a roman numeral, convert it to an integer.
// Input is guaranteed to be within the range from 1 to 3999.
// Subscribe to see which companies asked this question
package leetcode;
import java.util.Map;
import java.util.HashMap;
public class Test {
	public static void main(String[] args){
		Solution s = new Solution();
		String sss = "MMMDLXXXVI";
		int i = s.romanToInt(sss);
		System.out.println(i);
	}
}

class Solution {
    public int romanToInt(String s) {
    	Map<Character, Integer> romanMap = new HashMap<>();
    	romanMap.put('I', 1);
    	romanMap.put('V', 5);
    	romanMap.put('X', 10);
    	romanMap.put('L', 50);
    	romanMap.put('C', 100);
    	romanMap.put('D', 500);
    	romanMap.put('M', 1000);
    	
    	int value = 0;
    	int i = 0;
        for(i = 0; i < s.length(); i++){
        	if(i+1 < s.length() && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))){
        		value = value + romanMap.get(s.charAt(i + 1)) - romanMap.get(s.charAt(i));
        		i++;
        	} else {
        		value = value + romanMap.get(s.charAt(i));
        	}
     
        }
        return value;
    }
}
