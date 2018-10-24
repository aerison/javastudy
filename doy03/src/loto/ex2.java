package loto;

import java.util.Random;

public class ex2 {

	public static void main(String[] args) {
	/*
		int nums[] = new int[6];
		nums[0] =10;
		nums[1] =20;
		nums[2] =30;
		nums[3] =40;
		nums[4] =50;
		nums[5] =60;
		
		for(int i=0; i<=5; i++) {
			System.out.println(nums[i]);
		}

	
	
		int nums[] = new int[6];
		nums[0] =10;
		nums[1] =20;
		nums[2] =30;
		nums[3] =40;
		nums[4] =50;
		nums[5] =60;
		
		for(int a:nums) {
			System.out.println(a);
		}
		
		*/
		
		int nums[] = new int[6];
		
		Random r = new Random();
		for(int i=0; i<6; i++) {
			nums[i] = r.nextInt(45)+1;
		}
		
		for(int a:nums) {
			System.out.println(a);
		}
		
		
		
		
	}

}
