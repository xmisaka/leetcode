package algorithm;

/** 
 * @ClassName: Code344_ReverseString 
 * @Description: Write a function that takes a string as input and returns the string reversed. 
 * @author Warming 
 * @date 2016-6-23 上午11:19:46 
 *  
 */
public class Code344_ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "hello";
		char[] array = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		char temp;
		while(i < j){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		
		
	}

}
