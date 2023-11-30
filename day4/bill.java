
import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pen = sc.nextFloat();
        double eraser = sc.nextFloat();
        double pencil = sc.nextFloat();
        double t = (pen + pencil + eraser);
        double total = t + 0.18d*t;
        System.out.println("total bill with including gst:"+ total);
    }
    
}
