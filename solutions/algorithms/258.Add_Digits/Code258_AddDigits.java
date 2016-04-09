package algorithm;

/** 
 * @ClassName: Code258_AddDigits 
 * @Description: https://leetcode.com/problems/add-digits/
 * @author Warming 
 * @date 2016-4-8 обнГ5:10:55 
 *  
 */
public class Code258_AddDigits {

	public static int addDigits(int num) {
		if(num == 0){
			return 0;
		}
		else if(num % 9 == 0){
        	return 9;
        }else{
        	return num % 9;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
