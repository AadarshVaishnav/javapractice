//for find that given num is greater then a or not

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
     Scanner xz = new Scanner(System.in);

        int a = 8;
     System.out.println("enter your number");
     int b = xz.nextInt();
     boolean b1 =  (b>a);
     System.out.println(b1); 
     xz.close(); 
    }
}
