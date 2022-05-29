/*9. Write a program using functions and pointers to implement substrptr 
(char s1[], char s2[]) with two arguments of character array type containing 
source string (s1)and substring(s2). Function should return an address of a 
substring in a string if present else a NULL pointer

 */
import java.util.Scanner;
public class que9 {
        public static void address(String s1,String s2)
    {
        System.out.println(s1.indexOf(s2));
    }
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        if(s1.contains(s2))
        {
            address(s1,s2);
        }
        else
       {
           System.out.println("doesnt contain");
        }       
   }
}
