/*
 3. Write a program to accept a number from the user and count the number of digits in the number.
 */
import java.util.Scanner;
public class que3 {
        public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = s.nextInt();
            int count=0;
            while(num!=0){
                 
                 num = num/10;
                 count++;
        
            }
            System.out.println("Number of digits is: "+count);
        }
}
