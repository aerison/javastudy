package workshop;

public class work2 {

	public static void main(String[] args) {
		int x = 15;
		// 1. int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		if((10 < x)&&(20 > x)) {
			System.out.println("1true");
		}
		// 2. char�� ���� ch �� �����̳� ���� �ƴ� �� true�� ���ǽ�
		char ch1 = ' ';
		if((ch1!=' ')||(ch1!='\t')) {
			System.out.println("2true");
		}
		// 3. char�� ���� ch�� 'x' �Ǵ� 'x' �϶� true�� ���ǽ�
		char ch2 = 'x';
		if((ch2 == 'x')&&(ch2 == 'X')) {
			System.out.println("3true");
		}
		// 4. char�� ���� ch�� ���� ( 0 ~ 9 ) �϶� ture�� ���ǽ�
		char ch3 = '0';
		if ((int) ch3 >= 48 && (int) ch3 <= 57) {
			System.out.println("4true");

		}
		// 5. char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�� �� true�� ���ǽ�
		 char ch4 = 'a';
		 if ((ch4 =='a')||(ch4 =='A')) {
			 System.out.println("5true");
		 }
		 
		 // 6. it�� ���� year�� 400���� ���� �������ų� �Ǵ� 4�� ���� �������� 
		 //    100���� ���� �������� ���� �� ture�� ���ǽ�
		 
		 int year = 400;
		 if(year/400 == 0 || (year/4 == 0 && year/100 !=0)) {
			 System.out.println("6true");
		 }
		 
		 // 7. boolean�� ���� powerOn �� false�� �� true�� ���ǽ�
		 
		 boolean powerOn = false;
		 if (!powerOn) {
			 System.out.println("7true");
		 }
		 
		 // 8. ���ڿ� �������� str�� "yes"�� �� ture�� ���ǽ�
		 String str = "yes";
		 if(str.equals("yes")) {
			 System.out.println("8true");
		 }

	}

}
