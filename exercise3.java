//taking user name input and greeting them
import java.util.Scanner;

public class exercise3 {
     public static void main(String[] args) {
         Scanner tv = new Scanner(System.in);
         System.out.println("enter your name");
         String a = tv.nextLine();
         System.out.print("welcome mr/mrs " + a);
         tv.close();
        

        
    }
    
}
