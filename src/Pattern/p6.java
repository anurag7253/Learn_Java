package Pattern;

import java.util.Scanner;
    public class p6 {
        public static void patter2(int n){
            for (int i = 0; i < n; i++){
                for (int j =0; j<n-i-1; j++){
                    System.out.print(" ");
                }
                for(int j=0;j< 2*i+1;j++){
                    System.out.print("*");
                }
                for (int j =0; j<n-i-1; j++)
                {
                    System.out.print(" ");
                }
                System.out.println();
            }


        }

        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter number");
            int n = s.nextInt();
            patter2(n);
        }
}
