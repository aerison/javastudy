package sbs;

public class Hello2 {

	public static void main(String[] args) {
		//���� - int 21��
		int a = 10;
		byte b = 10;
		byte result = (byte) (a + b);
		
		// �Ǽ� - double 64bit
		double d = 120000000000000000000000000000000000.2;
		
		int result2 = (int) (a + d);
		System.out.println(result2);
		
		boolean bb = true;
		
		char cc = 'a';
		
	}

}

/* 1.���α׷� ���� ȯ��
 * 2.�ڹ� ���α׷� ����
 * 3. ����
 * ���� - int 32
 * �Ǽ� - double - 64
 * Boolean
 * char
 * 
 * 4. ������
 * 5. ���ǹ�, �ݺ���
 * */