public class operaters_ass {
    public static void main(String[] args){
        int a = 6*5-34/2;
        /*
          =30-34/2
          =30-17
          =13    *becauce of precedence grater operater will be calculate first thus 6*5 calculated first
        */
        int b = 60/5-34*2;
        /*
          =12-34*2
          =12-64
          =-54        *because / and * has same precedence so by associativity it wil calculated 'left to right' 
        */
        System.out.println(a);
        System.out.println(b);
    }

}
