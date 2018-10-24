package loto;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("메뉴를 입력하세요");
		int menu = sc.nextInt();
		if(menu == 99) {
			System.out.println("Bye");
			sc.close();
			break;
		} else if (menu ==1) {
			System.out.println("당신의 숫자를 입력 하시오(6개)");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			int num5 = sc.nextInt();
			int num6 = sc.nextInt();
			System.out.println(num1+" "+num6);
		} else if(menu ==2) {
			System.out.println("당신은 5등 입니다.");
			System.out.println("당첨 축하합니다.");
		}
		System.out.println(menu);
		}
	}

}
