package workshop;
 
import java.util.Random;
 
public class work3 {
 
    public static void main(String[] args) {
        Random r = new Random();
        long a = (Math.abs(r.nextLong()) % 9999999900L) + 100L;
        long b = (Math.abs(r.nextLong()) % 9999999900L) + 100L;
        
        if((a+b) % 2 == 0) {
            System.out.printf("%d + %d = %d, Â¦¼ö",a,b,a+b);
        }
        else {
            System.out.printf("%d + %d = %d, È¦¼ö",a,b,a+b);
        }
    }
}
