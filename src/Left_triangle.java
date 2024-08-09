import java.util.Scanner;

public class Left_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number");
        int num = sc.nextInt();

      for(int i=1 ; i<= num; i++){

          for(int z=1 ; z <= (num-i); z++){
              System.out.print(" ");
          }
            for(int k=1;k<=i;k++){
                System.out.print("*");
          }
            System.out.println();
      }

    }
}
