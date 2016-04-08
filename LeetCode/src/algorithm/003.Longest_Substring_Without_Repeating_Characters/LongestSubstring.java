package algorithm;

import java.util.HashMap;

/** 
 * @ClassName: Code3_LongestSubstring 
 * @Description: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * @author Warming 
 * @date 2016-4-7 ÏÂÎç5:58:00 
 *  
 */
public class Code3_LongestSubstring {

	public static int lengthOfLongestSubstring(String s){
		int res = 0,left = 0;
		HashMap<Character,Integer> hisMap = new HashMap<Character,Integer>();
		for(int i = 0; i < s.length(); i++){
			Character cur = s.charAt(i);
			if(hisMap.get(cur) != null && hisMap.get(cur) >= left){
				left = hisMap.get(cur) + 1;
			}
			hisMap.put(s.charAt(i), i);
			if(i - left + 1 > res){
				res = i - left + 1;
			}
		}
		
		return res;
	}
	

	public static int lengthOfLongestSubstring2(String s) {  
        int res = 0, left = 0;  
        int prev[] = new int[300];  
  
        for (int i = 0; i < 300; ++i)  
            prev[i] = -1;  
  
        for (int i = 0; i < s.length(); ++i) {  
            if (prev[s.charAt(i)] >= left) {
                left = prev[s.charAt(i)] + 1; 
                //System.out.println(prev['a']);
            }
            prev[s.charAt(i)] = i;  
            if (res < i - left + 1)  
                res = i - left + 1;  
        }  
        return res;  
    }  
	
	
	
	public static void main(String[] args) {
		String s = "abcabcabcde";
		//System.out.println(s.charAt(0));
		System.out.println(lengthOfLongestSubstring2(s));

	}

}
