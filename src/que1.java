
import java.util.Scanner;

/*
 1. Write a program to accept a five digit number from the user, increment each digit by one and display the number (digit 9 gets incremented to 0).

Example:
Input: 14385
Output: 25496

 */
public class que1 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter five digit number: ");
        int num = s.nextInt();
        int ele, rev =0;
        if(num>=10000 && num<=99999){
            while(num!=0){
             ele = num%10;
             if(ele == 9)
                 ele = 0;
             else
                ele +=1;
            num/=10;
            rev = rev*10+ele;
        }
        int n = 0;
        while(rev>0){
            n= n*10+rev%10;
            rev/=10;
        }
        System.out.println(n);
    }
    }
}
