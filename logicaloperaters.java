public class logicaloperaters {
    public static void main(String[] args) {
        
        Boolean a = false ;
        boolean b = true ;
        
        //for logical AND
        if (a && b ){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
      
        //for logical OR
         if (a || b ){
             System.out.println("yes");
         }
         else {
             System.out.println("no");
         }

         //for Not a
         System.out.println(!a);
         System.out.println(!b);
        }
}
