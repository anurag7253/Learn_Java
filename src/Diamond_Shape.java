import java.util.Scanner;
public class Diamond_Shape {
    public static void main(String[] args){
        System.out.println("Enter the number of Lines you want to Print :");
//        Scanner s = new Scanner(System.in);
          int num = 6;

          for(int i=0; i<=num; i++){
              for(int j =1 ; j<=i; j++){
                  System.out.print("*" + " ");
              }
             System.out.println();
          }

    }
}
