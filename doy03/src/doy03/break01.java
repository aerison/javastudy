package doy03;

public class break01 {

	public static void main(String[] args) {
		jj:
		for(int row=2; row<10; row++) {
			for(int col=1; col<10; col++) {
				if(row%2 == 1 && col%2 == 0) {
					System.out.print("[" + row +"x" + col + "=" + (row * col) + "]" );
				}
			 }
			System.out.println("");
		
		break jj;
	}


	}

}
 