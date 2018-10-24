package workshop;
 
import java.util.Scanner;
 
public class work4 {
 
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] a = new int[5];
        while(count < 5) {
            System.out.print("점수를 입력하세요 : ");
            int num = sc.nextInt();
            if(num < 10 || num > 99) {
                System.out.println("다시 입력해주세요!!");
                continue;
            }
            a[count] = num;
            count++;
        }
        double sum = (((a[0]+a[1])/2) * 0.6) + 
                (((a[2]+a[3])/2) * 0.2) + (a[4] * 0.2);
        sum /= 1.0 ;
        if((int)sum >= 90) {
            System.out.printf("평가점수 : %d\n",(int)sum);
            System.out.println("Gold Class");
        }
        else if((int)sum >= 80) {
            System.out.printf("평가점수 : %d\n",(int)sum);
            System.out.println("Sliver Class");
        }
        else if((int)sum >= 70) {
            System.out.printf("평가점수 : %d\n",(int)sum);
            System.out.println("Bronze Class");
        }
        else {
            System.out.printf("평가점수 : %d\n",(int)sum);
            System.out.println("Normal Class");
        }
    }
}
