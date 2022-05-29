/* 6. Given the list of N names, print it based on the alphabetical order of the first letter. If the first
letter of the two names is the same, print it in the order in the array.

Input Format
First-line will be N. Then N lines will have names.
Output Format
Names in sorted order

Sample Input 1:
4
Alice
Bob
Noah
Adam

*/
import java.util.Scanner;
public class que6 {
        public static void main(String [] args){
            int n;
            String temp;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of names: ");
            n = s.nextInt();
            String names[] = new String[n];
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter all the names: ");
            for(int i= 0;i<n;i++)
                names[i]=s1.nextLine();
            for(int i=0; i<n; i++){
                for(int j=i+1;j<n;j++){
                    if(names[i].compareTo(names[j])>0){
                        temp = names[i];
                        names[i]= names[j];
                        names[j] = temp;
                    }
                }
            }
            for(int i=0; i<=n-1;i++)
                System.out.println(names[i] );
            
                    
        }
}
