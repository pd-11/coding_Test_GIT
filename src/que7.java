/*7. Implement a browser that shows the current page it is in.
You have 3 commands
1)”forward”: It goes to the forward page if there is any else it returns the link of the current
page. If the browser is on the home page it prints “HOME”.
2)”backward”: It goes to the back page and prints the link to that page. If the browser is on the
home page then it prints “HOME”
3)”goto”: It goes to the link mentioned and prints the link of the current page.
The first or default page in the browser is the “HOME” page
 */
import java.util.Scanner;
public class que7 {
    public static void main(String[] args) {

           Scanner s=new Scanner(System.in);
           String[] array=new String[10];
            array[0]="HOME";
            int index=0;
            int choice=0;
            while(choice!=4)
            {
            System.out.println("enter 1 for forward\n2 to backward\n3 to goto\n 4 exit\n");
            choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    String temp=array[++index];
                    if(temp!="")
                    System.out.println(temp);
                    else
                        System.out.println(array[--index]);
                    break;
                case 2:
                    if(index==0)
                        System.out.println(array[0]);
                    else
                    {
                        System.out.println(array[--index]);
                    }
                    break;
                case 3:
                    System.out.println("enter page name");
                    temp=s.nextLine();
                    temp=s.nextLine();
                    array[++index]=temp;
                    System.out.println(array[index]);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    } 
}

