package day05;

public class ex01 {

	public static void main(String[] args) {
		
		String msg = "";
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append('a');
		sb.append('b');
		sb.append('c');
		msg = sb.toString();
		
		/*
		msg = msg + 'a';
		msg = msg + 'b';
		msg = msg + 'c';
		*/
		
		System.out.println(msg);

	}

}
