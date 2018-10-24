package day08;


import java.util.Scanner;
public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" main start ");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 / 점수 / 점수 / 점수 입력하세요");
		System.out.println("예); 홍길동 / 99 / 77 / 33 ");
		
		String data = scanner.nextLine();
		if(data.length() == 0) {
			System.out.println("정확한 데이터를 입력해 주세요");
			return;
		}
		
		String[] d = data.split("/");
		
		int sum = 0;
		
		try {
		for(int i=1; i<d.length; i++) {
			sum += Integer.parseInt(d[i].trim());
		}
		
		} catch(NumberFormatException e) {
			System.out.println("점수를 제대로 입력하세요");
		} 
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		double avg = sum/3.;
		System.out.printf("학생명 : %s , 평균 : %5.2f %n",d[0], avg);
		System.out.println(" main end ");

	}

}
