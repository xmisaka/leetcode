package algorithm;

/** 
 * @ClassName: Code136_SingleNumber 
 * @Description: https://leetcode.com/problems/single-number/
 * @author Warming 
 * @date 2016-4-8 обнГ4:52:29 
 *  
 */
public class Code136_SingleNumber {

	public static int singleNumber(int[] nums) {
	       int res = 0;
	        for(int num : nums){
	             res ^= num;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		
	}

}
