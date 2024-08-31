
package Codeforce;
import java.util.Scanner;
public class AWayTooLongWords {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       int num = s.nextInt();
        s.nextLine();

       for(int i= 0; i < num; i++){
           String name = s.nextLine();
           if(name.length() > 10){
               int len = name.length()-2;
               char first = name.charAt(0);  // First letter
               char last = name.charAt(name.length() - 1);  // Last letter
               System.out.println(first+""+len+""+last);
           }else{
               System.out.println(name);
           }


       }

        s.close();
    }
}
