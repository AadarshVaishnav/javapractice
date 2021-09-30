//taking user input
import java.util.Scanner;

public class userinput {
 
     public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        //   System.out.println("enter no. first");
        //   int a = sc.nextInt();
        //   System.out.println("enter no. second");
        //   int b = sc.nextInt();
        //   int c = a + b;
        //   System.out.println("the sum of tow number is =" + c);        
    
         //boolean b1 = sc.hasNextInt();
         //System.out.println(b1);

        //   String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
      
}
