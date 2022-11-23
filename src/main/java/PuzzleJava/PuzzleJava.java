package PuzzleJava;
import java.util.Arrays;

public class PuzzleJava {

    public static int[] filteredArray(int[] nums) {
        int k = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= i;
        }
        System.out.format("The total sum of the array is %s.\n", sum);
        nums = Arrays.stream(nums).filter(d -> d > 10).toArray();
        printAllElementsOfArray(nums);
        return nums;
    }

    public static void printAllElementsOfArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        int [] testCaseOne = {3,5,1,2,7,9,8,13,25,32};
        filteredArray(testCaseOne);
    }
}
