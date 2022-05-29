/*14. Write a program in the language of your choice to find out how many minutes M will it take for a phone to reach from charge A to charge B (A and B are inputs, M should be the output). The rate at which it gets charged at different levels was given. 
For example:
0<= C <= 10 : 8 mins
11<= C <= 50 : 6 mins
And so on
Sample: If A= 0 and B=5 then M is 8 because in 8 minutes it reaches 10 charge which is greater than 5.
 */
import java.util.Scanner;
public class que14 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int diff=b-a;
        if(diff<=10)
            System.out.println(8+" mins");
        else
        {
           
            System.out.println(14+" mins");
        }
        
    }
}
