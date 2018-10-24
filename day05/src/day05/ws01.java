package day05;

public class ws01 {

	public static void main(String[] args) {
	String sourceString =
			"everyday we have is one more than we deserve";
	String encodedString = "";
	StringBuilder sb = new StringBuilder();
	
	for(int i = 0; i<sourceString.length(); i++) {
		char c = sourceString.charAt(i);
		if( c == ' ') {
			//encodedString += c;
			sb.append((char)(c - 23));
			continue;
		}
		//if('x' <= c && c<='z') {
			//encodedString += (char)(c - 23);
			//continue;
		sb.append((char)(c+3));
		}
		
		//encodedString += (char)(c+3);
	encodedString = sb.toString();
	
	System.out.println("암호화할 문자열 : " + sourceString);
	System.out.println("암호화된 문자열 : " + encodedString);
	}

	}
