import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
