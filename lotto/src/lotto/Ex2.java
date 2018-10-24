package lotto;
import java.util.Random;
import java.util.Scanner;
public class Ex2 {
 
    public static void main(String[] args) {
        int[] nums = new int[6]; //Both int[] nums, int nums[] are possible. new int [array size]
        int[] nums2 = new int[6];
        int check = 0;
        Random r = new Random();    
        for(int i = 0; i<=5;i++) {
            nums[i] = r.nextInt(45)+1; //1~45
            check = 0;
            for(int j = 0; j <= i-1; j++) {
                if(nums[i] == nums[j]) {
                    check++;
                }
            }
            if(check != 0) {
                i--;
                continue;
            }
        }
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<=5;i++) {
            System.out.println((i+1)+"��° ��ȣ ����");
            nums2[i] = sc.nextInt();
            check = 0;
            for(int j = 0; j <= i-1; j++) {
                if(nums2[i] == nums2[j]) {
                    check++;
                }
            }
            if(check != 0) {
                System.out.println("Input again.");
                i--;
                continue;
            }
            else if(!(nums2[i]>=1 && nums2[i]<=45)){
                i--;
                continue;
            }
            
        }
        
        check = 0;
        long c = 9999990000L;
        long money = (long)(Math.random()*c)+10000;
        
        System.out.print("��÷��ȣ�� ");
        for(int i = 0; i<=5; i++) {
            for(int j = 0; j<=5; j++) {
                if(nums[i] == nums2[j]) {
                    check++;
                    System.out.print(nums[i]+" ");
                }
            }
        }
        System.out.println("�Դϴ�.");
        
        switch(check) {
        case 6: System.out.println("1� ��÷�Ǽ̽��ϴ�. ����� "+(money/2)+"�� �Դϴ�."); break;
        case 5: System.out.println("2� ��÷�Ǽ̽��ϴ�. ����� "+(money*0.3)+"�� �Դϴ�."); break;
        case 4: System.out.println("3� ��÷�Ǽ̽��ϴ�. ����� "+(money*0.1)+"�� �Դϴ�."); break;
        case 3: System.out.println("4� ��÷�Ǽ̽��ϴ�. ����� "+(money*0.05)+"�� �Դϴ�."); break;
        case 2: System.out.println("5� ��÷�Ǽ̽��ϴ�. ����� "+(money*0.02)+"�� �Դϴ�."); break;
        case 1: System.out.println("1���� ��ġ�մϴ�. ��Ÿ���Ե� ��÷���� ���ϼ̽��ϴ�."); break;
        default: System.out.println("0���� ��ġ�մϴ�. ��Ÿ���Ե� ��÷���� ���ϼ̽��ϴ�.");
        }
        
        
        System.out.println("��÷��ȣ: "+nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+" "+nums[4]+" "+nums[5]+" ");
        System.out.println("�� ��ȣ: "+nums2[0]+" "+nums2[1]+" "+nums2[2]+" "+nums2[3]+" "+nums2[4]+" "+nums2[5]+" ");
        System.out.println("�� ��÷���� "+money+"���Դϴ�.");
        
    }
}