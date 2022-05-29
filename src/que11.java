/*An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:
    The player with the highest score is ranked number on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
 */
import java.util.Scanner;
public class que11 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp1=n;
        int[] array1=new int[n];
        array1[0]=s.nextInt();
        for(int i=1;i<n;i++)
        {    
            int temp=s.nextInt();
            if(temp!=array1[i-1])
                array1[i]=temp;
            else
                n--;
        }
        int m=s.nextInt();
        int array2[]=new int[m];
        for(int i=0;i<m;i++)
            array2[i]=s.nextInt();
        
        int score=0;
        for(int i=0;i<array2.length;i++)
        {
            score=array2[i];
            for(i=array1.length;i>=0;i--)
                if(score>array1[i]) System.out.println(i+1);
        }        
    } 
}
