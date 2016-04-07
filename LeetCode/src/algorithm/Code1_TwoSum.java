package algorithm;

/** 
 * @ClassName: Code1_TwoSum 
 * @Description: Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
 * @author Warming 
 * @date 2016-4-7 обнГ4:30:05 
 *  
 */
public class Code1_TwoSum {

	public static int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
		int len = nums.length;
		for(int i = 0; i < len - 1; i++){
			for(int j = i + 1; j < len; j++){
				if(nums[i] + nums[j] == target){
					resultArray[0] = i;
					resultArray[1] = j;
					return resultArray;
				}
			}
		}
		
		return resultArray;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,7};
		int target = 7;
		int[] res = twoSum(nums, target);
		for(int i : res){
			System.out.println(i);
		}
	}

}
