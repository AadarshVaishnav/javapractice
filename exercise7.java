//to calculate percentage and then find out the guy is pass or not

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        

        System.out.println("enter your physics marks");
        int a = sc.nextInt();

        System.out.println("enter your chemistry marks");
        int b = sc.nextInt();

        System.out.println("enter your maths marks");
        int c = sc.nextInt();
        
        int sum = a +b+c;

        float percentage = sum/3f;

        System.out.println("");

        System.out.printf("your percentage is %.2f",percentage);
        System.out.println("%");
       
        System.out.println("");
       
        if(percentage>40 && a>33 && b>33 && c>33){
            System.out.println("you pass the exam");
        }
        //else if(a>33 && b>33 && c>33){
        //System.out.println("you  passed by grace");
        //}
        else{
            System.out.println("you failed the exam");
        }
       
        System.out.println("");

       sc.close();
    }
}
