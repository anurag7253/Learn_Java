package Pattern;

import java.util.Scanner;

public class p5 {
    public static void patter2(int row,int colm){

        for (int c=1; c <= colm; c++ ){
            for ( int r=1 ; r <= row ; r++){
                System.out.print("*"+" ");
            }
            row--;
            System.out.println();
        }


    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows (x)");
        int row = s.nextInt();
        System.out.println("Enter number if coloms (y)");
        int colm = s.nextInt();
        patter2(row,colm);
    }
}
