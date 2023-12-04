import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income<500000){
            System.out.println("your income tax is"+ 0);
        }
        else if(income>=500000 && income<1000000){
            System.out.println("your income tax is " + 0.2 *income);
        }
        else{
            System.out.println("your income tax is" + 0.3*income);
        }
    }
    

    
}
