import java.util.Scanner;


public class elseifclauseandswitchcase {
    public static void main(String[] args) {
        
        int age;
        System.out.println("enter your age");

        Scanner sn = new Scanner(System.in);
        age = sn.nextInt();
      /*  if (age>60){
            System.out.println("you are senior citizen");
        }
        else if(age==60){
            System.out.println("you are are going to be");
        }
        else if(age > 40){
            System.out.println("you are a adult citizen");
        }
        else if(age <21){
            System.out.println("you are a teenager");
        }
        else {
            System.out.println("you are adulty man ");
        }
          */
        switch(age){
            case 18:
            System.out.println("you are going to become an adult");
            break;
            
            case 23:
            System.out.println("you are geting a job");
            break;

            case 60:
            System.out.println("you are going to become seniro citizen");
            break;

            default:
            System.out.println("enjoy your lyf");
            
        }
        sn.close();
    }
    
}
