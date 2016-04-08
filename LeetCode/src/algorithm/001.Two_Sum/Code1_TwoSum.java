/** 
 * @ClassName: Code1_TwoSum 
 * @Description: Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
 * @author Warming 
 * @date 2016-4-7 下午4:30:05 
 *  
 */
public class Code1_TwoSum {
	//暴力破解
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
	//使用map
	public static int[] twoSum2(int[] nums, int target){
		int[] resArray = new int[2];
		HashMap<Integer,Integer> his = new HashMap<Integer,Integer>();
		int cur = -1;
		for(int i = 0; i < nums.length; i++){
			cur = target - nums[i];
			if(his.get(cur) == null){//如果map中没有数字与当前数之和等于target，则将当前数字放入map
				his.put(nums[i], i);
			}else{
				resArray[0] = his.get(cur);
				resArray[1] = i;
				break;
			}
		}
		
		return resArray;
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
