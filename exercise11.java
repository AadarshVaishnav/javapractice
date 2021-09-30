import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("enter your website url");
         String atr = sc.nextLine();
         
         if (atr.endsWith(".com")){
             System.out.println("it is an commercial website");
         }

         else if(atr.endsWith(".org")){
             System.out.println("it is an organization website");

         }

         else if(atr.endsWith(".in")){
             System.out.println("it is an indian website");

         }

         else {
             System.out.println("enter a valid extention");
         }
         

        sc.close();

    }
}
