import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        if(age >= 18){
            System.out.println("drive ,vote");
        }
        if(age>13 && age<18){
            System.out.println("teenagers");
        }
        else{
            System.out.println("no adults");
        }
    } 

    
}
