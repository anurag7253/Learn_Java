package Pattern;

import java.util.Scanner;

public class p3 {
    public static void patter2(int row,int colm){

        for (int c=1; c <= colm; c++ ){
            for ( int r=1 ; r <= c ; r++){
                System.out.print(r+" ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows (x)");
        int row = s.nextInt();
        System.out.println("Enter number if colons (y)");
        int colm = s.nextInt();
        patter2(row,colm);
    }
}
