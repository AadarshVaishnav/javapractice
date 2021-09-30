//calculate percentage of 5 subs
import java.util.Scanner;

class exerise{ 
  public static void main(String[] args) {
        
    System.out.println("enter score of your every subjects in  12th ");
    Scanner vx = new Scanner(System.in);
    System.out.println("enter your physics ");
    int a = vx.nextInt();
    System.out.println("enter your chemistry score");
    int b = vx.nextInt();
    System.out.println("enter your math score");
    int c = vx.nextInt();
    System.out.println("enter your english score");
    int d = vx.nextInt();
    System.out.println("enter your hindi score");
    int e = vx.nextInt();
    int sum = a+b+c+d+e;
    float percentage = sum/5f;
    System.out.println("your percentage in 12th is_ %" + percentage);
    System.out.println(percentage);
    vx.close();
    }
    
}
