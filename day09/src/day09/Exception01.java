package day09;

import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		
		try {
			if(msg.length() == 0) throw new IOException("���� �߻�");
			System.out.println("---------------------------");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("�ڿ� �ݳ�");
		}
		System.out.println(" === End ===");

	}

}
