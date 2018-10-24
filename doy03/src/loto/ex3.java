package loto;

public class ex3 {

	public static void main(String[] args) {
	//	int num1[] = new int[6];
		
		int nums[] = {5,2,24,38,41,43};
		int mynums[] = {5,2,24,31,40,44};
		
		int cnt =0;
		
		for(int i=0; i<mynums.length; i++) {
			for(int j = 0; j<nums.length; j++) {
				if(mynums[i] == nums[j]) {
					cnt++;
				}
			
			}
		}
			System.out.println(cnt);
	}

}
