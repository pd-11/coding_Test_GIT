/*10. Write a C program that checks if a given password is strong, weak or moderate as 
per the rules given below. 
i) If it contains a combination of digits, alphabets and special characters, then the password is strong. 
ii) If it contains a combination of only digits and alphabets, then the password is moderate. 
iii) If it contains only alphabets, then the password is weak. 
*/
import java.util.Scanner;
public class que10 {
    public static boolean isDigit(String pass)
  {
       boolean flag=false;
        for(int i=0;i<pass.length();i++)
        {
            int temp=(int)pass.charAt(i);
            if(temp>=48 && temp<=57)
            {
                flag=true;
                return flag;
            }
        }
        return flag;
    }
    
    public static boolean isAlphabet(String pass)
    {
        boolean flag=false;
        for(int i=0;i<pass.length();i++)
        {
            int temp=(int)pass.charAt(i);
            if((temp>=97 && temp<=122) || (temp<=90 && temp>=65))
            {
                flag=true;
                return flag;
            }
        }
        return flag;
    }
    
    public static boolean isSpecial(String pass)
    {
        boolean flag=false;
        for(int i=0;i<pass.length();i++)
        {
            int temp=(int)pass.charAt(i);
            if((temp>=32 && temp<=47) || (temp>=58 && temp<=64) || (temp>=91 && temp<=96) || (temp>=123 && temp<=126) )
            {
                flag=true;
                return flag;
            }
        }
        return flag;
    }
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String pass=s.nextLine();
        if(isDigit(pass) && isAlphabet(pass) && isSpecial(pass))
        {
            System.out.println("password is strong");
        }
        else if(isDigit(pass) && isAlphabet(pass))
        {
            System.out.println("password is moderate");
        }
        else if(isAlphabet(pass))
        {
            System.out.println("password is weak");
        }
    }

}
