package algorithm;

import java.util.Scanner;

/** 
 * @ClassName: Code338_CountingBits 
 * @Description: https://leetcode.com/problems/counting-bits/
 * @author Warming 
 * @date 2016-4-8 ÏÂÎç1:50:07 
 *  
 */
public class Code338_CountingBits {

	public static int[] countBits(int num) {
		int[] resArray = new int[num+1];
		resArray[0] = 0;
		for(int i = 1; i <= num; i++){
			resArray[i] = resArray[i >> 1] + i % 2;
		}
		return resArray;
    }
	
	public static int[] countBits2(int num){
		int[] resArray = new int[num+1];
		int pow2 = 1;
		for(int i = 1; i <= num; i++){
			if(i == pow2){
				resArray[i] = 1;
				pow2 <<= 1;
			}else{
				resArray[i] = 1 + resArray[i - (pow2 >> 1)];
			}
		}
		return resArray;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int k = 10;
		while(--k != 0 ){
			num = sc.nextInt();
			int[] a = countBits2(num);
			for(int i : a){
				System.out.printf("%-5d",i);
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
