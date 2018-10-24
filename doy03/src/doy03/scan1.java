package doy03;

import java.util.Scanner;

public class scan1 {
	public static void main(String[] args) {
	
	// Scanner sc = new Scanner(System.in);
		//	System.out.println("숫자를 입력 하세요");
	// int a = sc.nextInt();
	// System.out.println("Input Data.."+a);
	// sc.close();
	
	/* Scanner sc = new Scanner(System.in);
	System.out.println("숫자 1을 입력하세요");
	int a = sc.nextInt();
	System.out.println("숫자 2를 입력하세요");
	int b = sc.nextInt();
	int max_num = 0;
	//두 수의 최대값
	if(a > b) {
		max_num = a;
	}else {
		max_num =b;
	}
	
	System.out.println("Max number.." + max_num);
	sc.close();
*/
		
	Scanner sc = new Scanner(System.in);

	System.out.println("세 개의 수의 최소값을 구합니다. \n");
	System.out.println("첫번째 숫자를 입력해 주세요");
	int a = sc.nextInt();
	System.out.println("두번째 숫자를 입력해 주세요");
	int b = sc.nextInt();
	System.out.println("세번째 숫자를 입력해 주세요");
	int c = sc.nextInt();
	
	int min_num = 0;
	//세 수의 최소값
	if(min_num >= a) {
		min_num = a;
	}
	if(min_num >= b) {
		min_num = b;
	}
	if(min_num >=c) {
		min_num = c;
	}
	
	System.out.println("가장 작은 수는 : " + min_num);
	sc.close();
	
	
}
}

