package util;

public class Calc {
	
	public static int add(int a,int b) {
		return a + b;
		
	}
	
	// ���� ���� (�迭�� ó�� �� )
	public static int add(int ... a) {
		int sum = 0;
		
		for(int data :a) {
			sum += data;
		}
		return sum;
	}
	
	public static double add(double a , double b) {
		return a + b;
		
	}
	
	
	public static int multi (int a, int b) {
		return a * b;
	}
	
	
	{
		
	}
}
