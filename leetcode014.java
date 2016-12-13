package leetcode;
public class Test {
	public static void main(String[] args){
		Solution s = new Solution();
		String[] sss = {"a"};
		String i = s.longestCommonPrefix(sss);
		System.out.println(i);
		System.out.println("over");
	}
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) return "";
    	int minLength = strs[0].length();
        for(int i = 0; i < strs.length; i++){
        	if(strs[i].length() < minLength){
        		minLength = strs[i].length();
        	}
        }
        for(int i = 0; i < minLength; i++){
        	char c = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
            	if(strs[j].charAt(i) != c){
            		return strs[0].substring(0,i);
            	}
            }
        }
        return strs[0].substring(0,minLength);
    }
}
