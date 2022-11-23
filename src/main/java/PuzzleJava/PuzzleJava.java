package PuzzleJava;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

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

    public static ArrayList<String> filterNameList(String[] arr) {

        ArrayList<String> filteredNameList = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                filteredNameList.add(arr[i]);
            }
        }
        printAllElementsOfArrayList(filteredNameList);
        return filteredNameList;
    }

    public static void printAllElementsOfArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void printAllElementsOfArrayList(ArrayList<String> list) {
        for (String x : list) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int [] testCaseOne = {3,5,1,2,7,9,8,13,25,32};
        filteredArray(testCaseOne);

        System.out.println("####################################");
        String[] namesList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        filterNameList(namesList);

        System.out.println("####################################");
        
    }
}
