public class exercise6 {
    public static void main(String[] args) {
        
        String exe = "\"Good  mornig   mr <|name|>\"";
        
        //problem 1
        exe = exe.toLowerCase();
        System.out.println(exe);
      
        //problem 2
        System.out.println(exe.replace( ' ', '_'));
      
        //problem 3
       System.out.println(exe.replace("<|name|>","Aadarsh  Vaishnav"));
       
       //problem 4
      System.out.println(exe.indexOf("  "));//it returns index of double  space and if it is not there in string than it returns -1. 
      System.out.println(exe.indexOf("   "));//it returns index of trippel space and if it is not there in string than it returns -1. 

      //problem 5

    }
}
