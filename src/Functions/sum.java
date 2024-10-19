package Functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        greet();
        int M = multi();
        System.out.println(M);
    }
//        ADD FUNCTION
       static void add(){
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1 number :");
        int num1 = s.nextInt();
        System.out.print("enter 1 number :");
        int num2 = s.nextInt();
        System.out.println("Sum of Num1 AND Num2 is:" + (num1+num2) );
    }
//        GREETING FUNCTION
    static void greet(){
        System.out.println("GOOD MORNING");
    }

//    MULTIPLY FUNCTION WITH RETURN TYPE

    static int multi() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter 1 number :");
        int num1 = s.nextInt();
        System.out.print("enter 1 number :");
        int num2 = s.nextInt();
        int ans = num1*num2;
        return ans;
    }

}
