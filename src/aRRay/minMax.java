package aRRay;
import java.util.Scanner;
public class minMax {

    public static int[] fillArray(int[] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Elements of Array: ");
        for (int i=0; i<arr.length; i++) {
            arr[i]= s.nextInt();
        }
        return arr;
    }

    public static void printArr(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void minMAx(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i=0; i< array.length; i++){
            if (array[i] > max){
                max=array[i];
            }
            if (array[i] < min){
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("Min of Array is "+ min);
        System.out.println("Max of Array is "+ max);

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        array = fillArray(array);
        printArr(array);
        minMAx(array);
        s.close();
    }

}
