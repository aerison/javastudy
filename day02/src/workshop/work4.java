package workshop;
 
import java.util.Scanner;
 
public class work4 {
 
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] a = new int[5];
        while(count < 5) {
            System.out.print("������ �Է��ϼ��� : ");
            int num = sc.nextInt();
            if(num < 10 || num > 99) {
                System.out.println("�ٽ� �Է����ּ���!!");
                continue;
            }
            a[count] = num;
            count++;
        }
        double sum = (((a[0]+a[1])/2) * 0.6) + 
                (((a[2]+a[3])/2) * 0.2) + (a[4] * 0.2);
        sum /= 1.0 ;
        if((int)sum >= 90) {
            System.out.printf("������ : %d\n",(int)sum);
            System.out.println("Gold Class");
        }
        else if((int)sum >= 80) {
            System.out.printf("������ : %d\n",(int)sum);
            System.out.println("Sliver Class");
        }
        else if((int)sum >= 70) {
            System.out.printf("������ : %d\n",(int)sum);
            System.out.println("Bronze Class");
        }
        else {
            System.out.printf("������ : %d\n",(int)sum);
            System.out.println("Normal Class");
        }
    }
}
