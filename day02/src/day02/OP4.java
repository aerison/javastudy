package day02;

public class OP4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println( a == b);
		
		int x = 10;
		System.out.println( (x < 4) || ( x > 10) );
		//둘 중 하나라도 맞으면 ture ( and 연산)
		int y = 10;
		System.out.println( ( x >= 4 ) && (x >= 20) );
		// 둘다 맞아야 true ( or 연산 )
		
		//삼항연산
		int s = 10;
		int result = ( s > 0) ? +1 : -1;
		//                     true  false
		
		//대입연산
		int aa = 10;
		aa += 1;
		System.out.println(aa);
		// aa = aa + 1;
		// aa = ++aa;
	}

}
