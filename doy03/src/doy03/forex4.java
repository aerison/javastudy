package doy03;

import java.util.Scanner;

public class forex4 {

	public static void main(String[] args) {
		/* 정수를 입력 받는다. 
		   정수의 범위 10 - 100까지의 정수
		   만약 범위에서 넘어가면 프로그램 종료
		   입력 받은 숫자까지에서 난수를 발생 시킨다
		   난수까지의 합과 평균을 구하시오 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = sc.nextInt();
		if( (a >= 10) && (a <= 100) ) {
			}else{
				System.out.println("프로그램을 종료합니다");
		}
		
		sc.close();
		
		int ran =(int) (Math.random());
		System.out.println(ran);
		
		
		

	}

}
