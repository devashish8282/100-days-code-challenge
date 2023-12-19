import java.util.*;
public class printoneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print your limit");
       
        int n = sc.nextInt();
         System.out.println(n);
        int counter = 1;
        while(counter<=n
        ){
            System.out.print(counter+ " ");
            counter++;
        }
    }
    
}
