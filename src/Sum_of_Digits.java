import java.util.*;
public class Sum_of_Digits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        double k = s.nextDouble();
        double ans = 0;
        while(k > 0){
                   double d = k % 10;
                   ans += d;
                   k = k/10;

        }
        System.out.println("Ans is " + ans); // this is showing  ans in double format
        int fa = (int) Math.round(ans);
        System.out.println("Ans is " + fa); //this is showing int using math round function (mathod)..

    }
}
