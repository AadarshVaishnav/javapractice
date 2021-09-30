

public class exercise13 {

    public static void main(String[] args) {
         
        for(int a= 1; a<5; a++){
            System.out.print(" * ");
           
        }
        System.out.println("");
        for(int a= 1; a<4; a++){
            System.out.print(" * ");
            
        }
        System.out.println("");
        for(int a= 1; a<3; a++){
            System.out.print(" * ");
            
        }
        System.out.println("");
        for(int a= 1; a<2; a++){
            System.out.print(" * ");
            
        }
    System.out.println("");

        // another mathode

        int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}
