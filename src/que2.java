/*2.Write a program to accept a four digit number from the user and display its denomination.

Example: 5698
Output: 5*1000 =5000
6*100 =600
9*10 =90
8*1 =8

 */
import java.util.Scanner;
public class que2 {
        public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int[] array=new int[10];
        int top=-1;
        int num=s.nextInt();
        while(num>0)
        {
            int temp=num%10;
            array[++top]=temp;
            num=num/10;
        }
        int a=1000;
        while(top!=-1)
        {
            int temp=array[top--];
            System.out.println(temp+" * "+a+" = "+(temp*a));
            a=a/10;
        }
    } 
}
