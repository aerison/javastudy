package doy03;

import java.util.Scanner;

public class scan1 {
	public static void main(String[] args) {
	
	// Scanner sc = new Scanner(System.in);
		//	System.out.println("���ڸ� �Է� �ϼ���");
	// int a = sc.nextInt();
	// System.out.println("Input Data.."+a);
	// sc.close();
	
	/* Scanner sc = new Scanner(System.in);
	System.out.println("���� 1�� �Է��ϼ���");
	int a = sc.nextInt();
	System.out.println("���� 2�� �Է��ϼ���");
	int b = sc.nextInt();
	int max_num = 0;
	//�� ���� �ִ밪
	if(a > b) {
		max_num = a;
	}else {
		max_num =b;
	}
	
	System.out.println("Max number.." + max_num);
	sc.close();
*/
		
	Scanner sc = new Scanner(System.in);

	System.out.println("�� ���� ���� �ּҰ��� ���մϴ�. \n");
	System.out.println("ù��° ���ڸ� �Է��� �ּ���");
	int a = sc.nextInt();
	System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
	int b = sc.nextInt();
	System.out.println("����° ���ڸ� �Է��� �ּ���");
	int c = sc.nextInt();
	
	int min_num = 0;
	//�� ���� �ּҰ�
	if(min_num >= a) {
		min_num = a;
	}
	if(min_num >= b) {
		min_num = b;
	}
	if(min_num >=c) {
		min_num = c;
	}
	
	System.out.println("���� ���� ���� : " + min_num);
	sc.close();
	
	
}
}

