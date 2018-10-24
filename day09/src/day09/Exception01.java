package day09;

import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		
		try {
			if(msg.length() == 0) throw new IOException("문제 발생");
			System.out.println("---------------------------");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("자원 반남");
		}
		System.out.println(" === End ===");

	}

}
