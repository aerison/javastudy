package loto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		int nums[] = new int[6];
		
	Random r = new Random();
		
	for (int i=0; i<6; i++) {
		nums[i] = r.nextInt(45)+1;
	}
	for(int a : nums) {
		System.out.println(""+a);
	}
	Scanner sc =new Scanner(System.in);
	System.out.println("당신의 숫자를 입력해 주세요");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	int num4 = sc.nextInt();
	int num5 = sc.nextInt();
	int num6 = sc.nextInt();
	
	
	}
	
	}
