import java.util.Scanner;

public class Factorial_Calculation {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();
        int fact = 1;
        while(number > 1){
            fact = (fact * number);
            number --;
        }

        System.out.println(fact);

    }
}
