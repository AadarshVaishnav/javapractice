import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
        
    
        
        System.out.println("enter your num 1 for rock , 2 for paper and 3 for scissor");
        int sign = sc.nextInt();

        int x = random.nextInt(3)+1;

        System.out.println(x);

        if(sign==1 && x==1){
            System.out.println("match tie");
        }
        else if(sign==1 && x==2){
            System.out.println("you loose");
        }
        else if(sign==1 && x==3){
            System.out.println("you win");
        }

        else if(sign==2 && x==1){
            System.out.println("you win");
        }
        else if(sign==2 && x==2){
            System.out.println("match tie");
        }
        else if(sign==2 && x==3){
            System.out.println("you loose");
        }

        else if(sign==3 && x==1){
            System.out.println("you loose ");
        }
        else if(sign==3 && x==2){
            System.out.println("you win");
        }
        else if(sign==3 && x==3){
            System.out.println("match tie");
        }



        sc.close();
    }
}
