package algorithm;

/** 
 * @ClassName: Code283_MoveZeros 
 * @Description: https://leetcode.com/problems/move-zeroes/
 * @author Warming 
 * @date 2016-4-8 обнГ6:36:07 
 *  
 */
public class Code283_MoveZeros {

	public static void moveZeroes(int[] nums) {
        int flag = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
        	nums[i-flag] = nums[i];
        	if(nums[i] == 0 && i != len-1){
        		flag++;
        	}
        }
        
        for(int j = 1; j <= flag; j++){
        	nums[len - j] = 0;
        }
        
        for(int k : nums){
        	System.out.printf("%-5d", k);
        }
	}
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}

}
