

public class loops {
    public static void main(String[] args) {
        
        //WHILE loop    - it never stops if condition never becomes false

        int a = 1;
         while(a<=5){
             System.out.println(a);
             a++;
         }
         System.out.println("finish runing while loops");


         // do-while loop - it execute at least  once in a while
         
         int b=1;

        do{
            System.out.println(b);
            b++;
        }  while(b<5);
        System.out.println("finish runing while loop");

        // for loop -
        for(int c=0; c<3; c++){ 
            System.out.println(c);
        }
        System.out.println("finish for loop");

        
      }
}
 