public class break_and_continue {
    public static void main(String[] args) {
        
      /*
         break;
      
        for(int i=0; i<50; i++){
            System.out.println(i);
            System.out.println("java here");
            if(i==3){
                System.out.println("ending the for loop ");
                break;
            }
        }
        
        int i =0;
        while(i<5){
            System.out.println(i);
            System.out.println("java sucks");
            if(i==2){
                System.out.println("ending the while loop");
                break;
            }
            i++;
        }

        int a=0;
        do{ 
            System.out.println(a);
            System.out.println("it's java");
            
            if(a==3){
                System.out.println("do while loops ending here");
                break;
            }
            a++;
        }while(a<4);
       */

      for(int i=0; i<5; i++){
        if(i==2){
            System.out.println(" java continue here");
            continue;
        }
        System.out.println(i);
        System.out.println("java bava");

        }

        int a=0;
        do{ 
            
            a++;
            if(a==3){
                System.out.println("continue do while loops ending here");
                continue;
            }

            System.out.println(a);
            System.out.println("it's java");

           
        }while(a<5);
        
    }
}
