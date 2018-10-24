package workshop;

public class work2 {

	public static void main(String[] args) {
		int x = 15;
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		if((10 < x)&&(20 > x)) {
			System.out.println("1true");
		}
		// 2. char형 변수 ch 가 공백이나 탭이 아닐 때 true인 조건식
		char ch1 = ' ';
		if((ch1!=' ')||(ch1!='\t')) {
			System.out.println("2true");
		}
		// 3. char형 변수 ch가 'x' 또는 'x' 일때 true인 조건식
		char ch2 = 'x';
		if((ch2 == 'x')&&(ch2 == 'X')) {
			System.out.println("3true");
		}
		// 4. char형 변수 ch가 숫자 ( 0 ~ 9 ) 일때 ture인 조건식
		char ch3 = '0';
		if ((int) ch3 >= 48 && (int) ch3 <= 57) {
			System.out.println("4true");

		}
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		 char ch4 = 'a';
		 if ((ch4 =='a')||(ch4 =='A')) {
			 System.out.println("5true");
		 }
		 
		 // 6. it형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고 
		 //    100으로 나눠 떨어지지 않을 때 ture인 조건식
		 
		 int year = 400;
		 if(year/400 == 0 || (year/4 == 0 && year/100 !=0)) {
			 System.out.println("6true");
		 }
		 
		 // 7. boolean형 변수 powerOn 이 false일 때 true인 조건식
		 
		 boolean powerOn = false;
		 if (!powerOn) {
			 System.out.println("7true");
		 }
		 
		 // 8. 문자열 참조변수 str이 "yes"일 때 ture인 조건식
		 String str = "yes";
		 if(str.equals("yes")) {
			 System.out.println("8true");
		 }

	}

}
