package day08;


import java.util.Scanner;
public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" main start ");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� / ���� / ���� / ���� �Է��ϼ���");
		System.out.println("��); ȫ�浿 / 99 / 77 / 33 ");
		
		String data = scanner.nextLine();
		if(data.length() == 0) {
			System.out.println("��Ȯ�� �����͸� �Է��� �ּ���");
			return;
		}
		
		String[] d = data.split("/");
		
		int sum = 0;
		
		try {
		for(int i=1; i<d.length; i++) {
			sum += Integer.parseInt(d[i].trim());
		}
		
		} catch(NumberFormatException e) {
			System.out.println("������ ����� �Է��ϼ���");
		} 
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		double avg = sum/3.;
		System.out.printf("�л��� : %s , ��� : %5.2f %n",d[0], avg);
		System.out.println(" main end ");

	}

}