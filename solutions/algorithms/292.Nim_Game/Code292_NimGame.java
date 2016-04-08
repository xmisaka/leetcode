package algorithm;

/** 
 * @ClassName: Code292_NimGame 
 * @Description: https://leetcode.com/problems/nim-game/
 * @author Warming 
 * @date 2016-4-8 обнГ4:12:42 
 *  
 */
public class Code292_NimGame {

	public static boolean canWinNim(int n) {
        return (n % 4 != 0);
        //return (n & 3) != 0;
    }
	public static void main(String[] args) {
		for(int i = 1; i < 20; i++){
			System.out.println(i + ":" + canWinNim(i));
		}
	}

}
