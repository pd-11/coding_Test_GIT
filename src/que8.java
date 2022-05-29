/*8. Write a C program to remove 3 or more consecutive characters from a string, repeat 
until there are no more 
Ex: MNHHHHNNM => MNNNM => MM
 */
import java.util.Vector;
public class que8 {
     static void remove(String str){
         Vector<Character> v = new Vector<>();
         for(int i=0; i<str.length(); ++i){
             v.add(str.charAt(i));
             if(v.size() > 2){
                 int sz = v.size();
                 if(v.get(sz -1) == v.get(sz -2) && v.get(sz - 2) == v.get(sz -3)){
                     v.setSize(sz - 3);
                 }
             }
         }
         for(int i =0; i<v.size(); ++i)
             System.out.println(v.get(i));
     }
     
     public static void main(String [] args){
         String str = " aabbbpaccddddc";
         remove(str);
     }
}
