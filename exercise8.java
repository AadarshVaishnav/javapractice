//to calculate income tax

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your income in rupee");
        int inc = sc.nextInt();

        if(inc>=250000 && inc<500000){
            int tax = (5*inc)/100;
            System.out.println("your tax amount is " + tax + " rupee");
        }
        else if(inc>=500000 && inc<1000000){
            int tax = (2*inc)/10;
            System.out.println("your tax amount is " + tax + " rupee");

        }
        else if(inc>=1000000){
            int tax = ( 3*inc)/10;
            System.out.println("your tax amount is " + tax + " rupee");

        }
        else{
            System.out.println("you don't have to pay tax");
        }

        sc.close();
    }
}
