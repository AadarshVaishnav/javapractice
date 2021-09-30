import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter year");
        int year = sc.nextInt();
        
        int a = year%4;
        
        if(a==0 || a==400 || a==800 || a==1200 || a==1600 || a==2000 || a==2400 ){
            System.out.println("it is an leap year");
        }
        else{
            System.out.println("it is not an leap year");
        }
        sc.close();
    }
}
