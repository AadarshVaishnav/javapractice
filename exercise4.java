//for encrypt and decrypt the data

public class exercise4 {
    public static void main(String[] args) {
    //my method
        char grade = 'b' ;
     grade += 8 ;
     System.out.println(grade);
     grade -= 8 ;
     System.out.println(grade);
    
    // harry's method
   // char grade = 'b';
    grade = (char)(grade+8);
    System.out.println(grade);
    grade = (char)(grade-8);
    System.out.println(grade);
    }
}
