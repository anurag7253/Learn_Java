package Functions;
import java.util.Scanner;
public class calculateAverage {
    private static int[] getArray(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;

    }
    private static double Average( double total, int size){

        total = (total/size);

        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = getArray(size);
        double total = 0.0;
        for(int x=0; x < size ; x++){
            total += array[x];
        }
        System.out.println(total);
        double Avg = Average(total, size);
        System.out.println(Avg);

    }



}
