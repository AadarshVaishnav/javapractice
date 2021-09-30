//change mile into km by taking input bye user 

import java.util.Scanner;

public class exercise2 {
     public static void main(String[] args) {
       Scanner vy = new Scanner(System.in);
        System.out.print("enter km value");
          int a = vy.nextInt();
          float b  = a/1.621f  ;
          System.out.println( "in mile -" + b); 
          vy.close();
        }
         
    
}
