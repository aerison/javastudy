package day02;

public class OP4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println( a == b);
		
		int x = 10;
		System.out.println( (x < 4) || ( x > 10) );
		//�� �� �ϳ��� ������ ture ( and ����)
		int y = 10;
		System.out.println( ( x >= 4 ) && (x >= 20) );
		// �Ѵ� �¾ƾ� true ( or ���� )
		
		//���׿���
		int s = 10;
		int result = ( s > 0) ? +1 : -1;
		//                     true  false
		
		//���Կ���
		int aa = 10;
		aa += 1;
		System.out.println(aa);
		// aa = aa + 1;
		// aa = ++aa;
	}

}
