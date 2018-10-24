package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			scanner = new Scanner (new File("sample.txt"));
			System.out.println("���Ϸ� ���� Read");
			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("sample.txt ���� Ȯ�� �ϼ���");
		} finally {
		}
		if(scanner != null)
			scanner.close();
		
		System.out.println("End");
		
	}
}