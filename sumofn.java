import java.util.*;
public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the limit is");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
            System.out.println("the sum is" + sum);
        }
    }

    
}
