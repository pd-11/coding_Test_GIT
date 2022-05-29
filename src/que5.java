/*
 5.Write a program to accept the lower bound number and the upper bound number from the user and print the prime numbers between them.
Expected output:
Enter the lower bound value:
5
Enter the upper bound value:
15
The prime numbers between 5 and 15 are: 5 7 11 13
 */
import java.util.Scanner;
public class que5 {
    public static void main (String[]args)
  {
    Scanner s = new Scanner(System.in);
    int lower = s.nextInt();
    int upper = s.nextInt();
    
    for (int i = lower; i <= upper; i++)
      if (isPrime (i))
	  System.out.println (i);
  }

  static boolean isPrime (int n)
  {
    if (n <= 1)
        return false;

    // special case as 2 is the only even number that is prime
    else if (n == 2)
        return true;

    else if (n % 2 == 0)
        return false;

    // If not, then just check the odds
    for (int i = 3; i <= Math.sqrt(n); i += 2)
    {
        if (n % i == 0)
            return false;
    }  
    return true;
}
}

