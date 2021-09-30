//detect wether input is int or not
import java.util.Scanner;

public class  exercise1 {
public static void main(String[] args) {
    System.out.println("enter number");  
    Scanner yt = new Scanner (System.in);
    boolean a = yt.hasNextInt();
    System.out.println(a);
    yt.close();
    
 }
     
 
    
}
