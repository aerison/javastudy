package doy03;

import java.util.Scanner;

public class forex4 {

	public static void main(String[] args) {
		/* ������ �Է� �޴´�. 
		   ������ ���� 10 - 100������ ����
		   ���� �������� �Ѿ�� ���α׷� ����
		   �Է� ���� ���ڱ������� ������ �߻� ��Ų��
		   ���������� �հ� ����� ���Ͻÿ� 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		if( (a >= 10) && (a <= 100) ) {
			}else{
				System.out.println("���α׷��� �����մϴ�");
		}
		
		sc.close();
		
		int ran =(int) (Math.random());
		System.out.println(ran);
		
		
		

	}

}
