import java.util.*;
public class yearcheck {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
System.out.println("enter the year:");
int year = sc.nextInt();
boolean x = (year  %  4 ) == 0;
boolean y = (year % 100) != 0;
boolean z = (year % 400 == 0 && year % 100 == 0) ;
if(x && (y || z)){
    System.out.println("the year is leap year");
}
else{
    System.out.println("the year is not leap ");
}
