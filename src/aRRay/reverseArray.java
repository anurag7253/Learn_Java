package aRRay;
import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("please enter array size:");
        int size = s.nextInt();
        int[] ar = new int[size];
        System.out.println("please enter array Data/index/numbers/..:");

        for(int i=0;i<size;i++){
            ar[i] = s.nextInt();
        }
        System.out.println("THIS IS YOUR ARRAY :");
        for(int i=0;i<size;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("THIS IS YOU REverse-ARRAY :");

        int[] rev = new int[size];
        int temp = 0;
        for(int i=size-1;i>=0;i--){
                rev[temp] = ar[i];
                temp++;
        }

        for(int i=0;i<size;i++){
            System.out.print(rev[i]+" ");
        }



    }
}
