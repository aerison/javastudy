package loto;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("�޴��� �Է��ϼ���");
		int menu = sc.nextInt();
		if(menu == 99) {
			System.out.println("Bye");
			sc.close();
			break;
		} else if (menu ==1) {
			System.out.println("����� ���ڸ� �Է� �Ͻÿ�(6��)");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			int num5 = sc.nextInt();
			int num6 = sc.nextInt();
			System.out.println(num1+" "+num6);
		} else if(menu ==2) {
			System.out.println("����� 5�� �Դϴ�.");
			System.out.println("��÷ �����մϴ�.");
		}
		System.out.println(menu);
		}
	}

}
