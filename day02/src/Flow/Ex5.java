package Flow;

public class Ex5 {

	public static void main(String[] args) {
	/* 90 초과 100 이하 A
	   80 초과 90 이하 B
	   70 초과 80 이하 C
	   60 초과 70 이하 D
	   60 이하 F
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
