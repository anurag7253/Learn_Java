package InterviewMaster100;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = s.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = s.nextInt();
        }
        System.out.println("Enter Target:");
        int target = s.nextInt();
//            main code
        int[] ans = new int[2];
        for(int i=0;i<nums.length-1;i++){
          for (int z=i+1;z<nums.length;z++){
              if(nums[i]+nums[z]==target){
                  ans[0]= i;
                  ans[1]=z;
              }
          }
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");  // Print the array elements
        }


    }
}
