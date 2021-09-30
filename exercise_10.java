import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter year");
        int year = sc.nextInt();
        
        
        boolean isLeapYear =false;
        if(year%400==0){
           // System.out.println("it is an leap year");
           isLeapYear=true;
        }
        else if(year%100==0){
           // System.out.println("it is not an leap year");
           isLeapYear=false;
        }
        else if(year%4==0){
          //  System.out.println("it is an leap year");
          isLeapYear=true;
        }
        else{
            //System.out.println("it is not leap year");
            isLeapYear=false;
        }

        String messsage = "It is "+ (isLeapYear ? "":"not ") +"leap year";
        System.out.println(messsage);;
        
        sc.close();
    }
}
