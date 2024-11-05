package Pattern;
import java.util.Scanner;

public class P1 {
    public static void patter1(int x,int y){

        for ( int i=0   ; i < x ; i++  ){
            for ( int j=0   ; j < y  ; j++  ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows (x)");
        int x = s.nextInt();
        System.out.println("Enter number if coloms (y)");
        int y = s.nextInt();
        patter1(x,y);
    }
}
