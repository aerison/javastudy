package Flow;

public class Ex5 {

	public static void main(String[] args) {
	/* 90 �ʰ� 100 ���� A
	   80 �ʰ� 90 ���� B
	   70 �ʰ� 80 ���� C
	   60 �ʰ� 70 ���� D
	   60 ���� F
	 */
	
	int score = 77;
	String result = "";
	
	if(score > 90) {
		result = "A";
	}else if(score > 80) {
		result = "B";
	}else if(score > 70) {
		result ="C";
	}else if(score > 60) {
		result = "D";
	}else {
		result = "F";
	}
	System.out.println(result);

	
	

	}

}
