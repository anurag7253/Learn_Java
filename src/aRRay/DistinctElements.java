package aRRay;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class DistinctElements {

    public static void distinct(int[] array){

        for (int i=0 ; i< array.length ; i++ ){

        }

    }



    public static int[] fillArray(int[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Elements of Array: ");
        for (int i=0; i<arr.length; i++) {
            arr[i]= s.nextInt();
        }
        return arr;
    }

    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int[] array = new int[size];
        Arrays.sort(array);
    fillArray(array);

    }
}
