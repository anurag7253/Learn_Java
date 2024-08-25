package Codeforce;
import java.util.Scanner;

public class A_Watermelon {

    public static void result(int a) {
        if (a > 2 && a % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();  // Test with 8
        result(w);
        s.close();
    }
}
