package Flow;

public class Ex4 {

	public static void main(String[] args) {
		// 100�� A
		// 90�� B
		// 80�� C
		// 70�� D
	int score = 90;
	String result = "";
	
	switch(score) {
	case 100: result = "A"; break;
	case 90: result = "B"; break;
	case 80: result = "C"; break;
	case 70: result = "D"; break;
	default: result = "F"; break;
	}
	System.out.println(result);
	
	
	}

	}
