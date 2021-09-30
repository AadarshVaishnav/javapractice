//to find avg
public class javaarraynptli {
     public static void main(String[] args) {
         int a[]= {10, 20, 30, 40, 60};

         for(int i=0;i<a.length;i++ ){
             System.out.println(a[i]);
         }
         System.out.println();
         float sum = 0;
         float avg;

         for ( int i=0;i<a.length;i++){
            sum =sum + a[i];
         }
         
         avg =sum/a.length;
         System.out.println("AVERAGE = "+ avg );
        
    }
    
}
