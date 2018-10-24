package doy03;

public class forex6 {

	public static void main(String[] args) {
		int row = 2;
		while(row <= 9) {
			int col = 1;
			if(row%2== 0) {
				row++;
				continue;
			}
			while(col <= 9){
				if(col%2 == 0) {
					System.out.print(row*col);	
				}
				col++;
			}
			System.out.println("");	
			row++;
		}
	}

}
