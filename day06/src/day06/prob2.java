package day06;

public class prob2 {
	 public static void main(String[] args) {
	  prob2 p = new prob2();
	  
	  System.out.println(p.leftPad("MDS", 6, '#'));
	  System.out.println(p.leftPad("MDS", 5, '$'));
	  System.out.println(p.leftPad("MDS", 2, '&'));
	 }

	 public String leftPad(String str, int size, char padChar) {
	  String result = "";
	  
	  if(str.length() >= size) {
	   result = str;
	  } else {
	   for(int i=0; i<size-str.length(); i++) {
	    result += padChar;
	   }
	   result += str;
	  }
	  
	  return result;
	 }
	}
