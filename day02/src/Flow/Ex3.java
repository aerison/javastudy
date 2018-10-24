package Flow;

public class Ex3 {
	public static void main(String[]args) {
	
	int score = 90;
	String result = "";
	if(score == 100) {
		result = "A";
	}else if(score == 90) {
		result = "B";
	}else if(score == 80) {
		result ="C";
	}else if(score == 70) {
		result = "D";
	}else {
		result = "F";
	}
	System.out.println(result);

}
}
