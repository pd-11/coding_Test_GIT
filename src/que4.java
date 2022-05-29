/* 4. Write a program to generate following patterns
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
import java.util.Scanner;
public class que4 {
        public static void main(String args[]){
            int n,i,j;
            Scanner s = new Scanner(System.in);
            n=s.nextInt();
            for(i =1;i<=n; i++){
                for(j=1; j<=i; j++)
                    System.out.print(j);
                for(j=i-1;j>=1;j--)
                    System.out.print(j);
                
            System.out.println("\n");    
            }
        }
}
