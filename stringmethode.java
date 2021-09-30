public class stringmethode {
    public static void main(String[] args) {
  String name =  "Harrryryy";
  
  int value = name.length(); // length methode = it returns length of string 
  System.out.println(value); 
  
  String lstring = name.toLowerCase(); //methode to  transform capital later into small later
  System.out.println(lstring); 
  
  String ustring = name.toUpperCase(); //methode to  transform small  later into capital  later
  System.out.println(ustring); 

  String nonTrimedstrinig = "   harry  ";
  System.out .println(nonTrimedstrinig); 
  System.out .println(nonTrimedstrinig.trim());//  allowed to trim the spaces after and before
  // we can also write it like * ( String trimmedString = nonTrimedstrinig.trim(); )

  System.out.println(name.substring(2));//it return substring  of String that how much lenght we want to print bye writing index num in '()' .
  System.out.println(name.substring(1,4)); // in this case value of index num that wrote after ',' will not print .
  
  System.out.println(name.replace('r' , 'p')); // replace char to char
  System.out.println(name.replace("rry" , "ier")); // replace substring to substring
  
  System.out.println(name.startsWith("Har"));//it indicates is the string starts with "Har"or not .
  System.out.println(name.endsWith("ry"));//it indicate is the string name ends with "ry" or not .

  System.out.println(name.charAt(4)); // return character at given index position .
  
  System.out.println(name.indexOf("ry")); //return index num .
  System.out.println(name.indexOf("r", 3)); // in this case we can give command that from where i want start looking for that perticular string's index.
  System.out.println(name.lastIndexOf("r")); // return index num that is is in last in name of string
  System.out.println(name.lastIndexOf("r", 5));//return last index of given string before given index (in this case'5')
  
  System.out.println(name.equals("harry"));// retuns true if given name is equal to "harry"otherwise false(case sensitive).
  System.out.println(name.equalsIgnoreCase("harry"));// same as above but ont case sensitive.

  System.out.println("im \"adars vasnv\""); // escape sequence character = \n(new line)  etc.
  System.out.println("");
    }
}






