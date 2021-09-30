import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
        
        System.out.println("enter your num 1 for rock , 2 for paper and 3 for scissor");
        String sign = sc.nextLine();

        int x = random.nextInt(3)+1;

        System.out.println(x);
        // String rock = "rock";
        // String paper = "paper";
        // String scissor = "scissor";
    
        if(matchRPS(sign) && x==1){
            System.out.println("match tie");
        }
        else if(matchRPS(sign) && x==2){
            System.out.println("you loose");
        }
        else if(matchRPS(sign) && x==3){
            System.out.println("you win");
        }

        // else if(sign.equals(paper) && x==1){
        //     System.out.println("you win");
        // }
        // else if(sign.equals(paper) && x==2){
        //     System.out.println("match tie");
        // }
        // else if(sign.equals(paper) && x==3){
        //     System.out.println("you loose");
        // }

        // else if(sign.equals(scissor) && x==1){
        //     System.out.println("you loose ");
        // }
        // else if(sign.equals(scissor) && x==2){
        //     System.out.println("you win");
        // }
        // else if(sign.equals(scissor) && x==3){
        //     System.out.println("match tie");
        // }

        sc.close();
   } 

   public static boolean matchRPS(String matchingString){
    String [] rps={"rock","paper","scissor"};
    boolean flag = false;
    for(int i=0; i<rps.length;i++){
        if(rps[i].equals(matchingString)){
            flag=true;
            break;
        }
    }
    return flag;
   }
}
