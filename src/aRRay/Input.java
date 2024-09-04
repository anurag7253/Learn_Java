package aRRay;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("please enter array size:");
        int size = s.nextInt();
        int[] ar = new int[size];
        System.out.println("please enter array Data/index/numbers/..:");

        for(int i=0;i<size;i++){
                 ar[i] = s.nextInt();
        }
        System.out.println("THIS IS YOU ARRAY :");
        for(int i=0;i<size;i++){
            System.out.print(ar[i]);
        }
    }
}
