package sbs;

public class Hello2 {

	public static void main(String[] args) {
		//정수 - int 21억
		int a = 10;
		byte b = 10;
		byte result = (byte) (a + b);
		
		// 실수 - double 64bit
		double d = 120000000000000000000000000000000000.2;
		
		int result2 = (int) (a + d);
		System.out.println(result2);
		
		boolean bb = true;
		
		char cc = 'a';
		
	}

}

/* 1.프로그램 개발 환경
 * 2.자바 프로그램 구조
 * 3. 변수
 * 정수 - int 32
 * 실수 - double - 64
 * Boolean
 * char
 * 
 * 4. 연산자
 * 5. 조건문, 반복문
 * */