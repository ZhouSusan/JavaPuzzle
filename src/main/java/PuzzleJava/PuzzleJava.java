package PuzzleJava;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

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

    public static void shufflingAlphabet() {
        ArrayList<Character> alphabetArr = new ArrayList<Character>();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabetArr.add(letter);
        }

        Collections.shuffle(alphabetArr);
        Character firstChar = alphabetArr.get(0);

        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        if (vowels.contains(firstChar)) {
            System.out.format("Looks like your first character is a vowel: %s. The last letter of the shuffled array is %s.\n",
                    firstChar, alphabetArr.get(25));
        } else {
            System.out.format("The last letter of the shuffled array is %s.\n The first letter is %s.\n",
                    alphabetArr.get(25), firstChar);
        }
    }

    public static int generateRandomNumber() {
        Random rand = new Random();
        int lowerBound = 55;
        int upperBound = 100;
        int randNum = rand.nextInt(upperBound - lowerBound) + lowerBound;
        return randNum;
    }

    public static int[] getTenRandomNums() {
        int[] randomNumArr = new int[10];
        for (int r = 0; r < randomNumArr.length; r++) {
            randomNumArr[r] = generateRandomNumber();
        }

        Arrays.sort(randomNumArr);
        printAllElementsOfArray(randomNumArr);
        System.out.format("Min Value: %s, Max Value: %s", randomNumArr[0], randomNumArr[9]);
        return randomNumArr;
    }

    public static String generateRandomString(int size) {
       char [] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
       StringBuilder randStr = new StringBuilder(size);
       Random rand = new Random();
       for (int s = 0; s < size; s++) {
           char c = letters[rand.nextInt(letters.length)];
           randStr.append(c);
       }
       String outputStr = randStr.toString();
       return outputStr;
    }

    public static void generateArrayOfRandomStrings(int size) {
        String[] arrayOfRandomness = new String[size];
        for (int i = 0; i < size; i++) {
            arrayOfRandomness[i] = generateRandomString(5);
            System.out.println(arrayOfRandomness[i]);
        }
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
        shufflingAlphabet();

        System.out.println("####################################");
        System.out.format("Your random number between 55- 100 is %s", generateRandomNumber());

        System.out.println("\n####################################");
        getTenRandomNums();

        System.out.println("\n####################################\n");
        System.out.println(generateRandomNumber());

        System.out.println("\n####################################\n");
        System.out.format("\nYour random string is %s", generateRandomString(5));

        System.out.println("\n####################################\n");
        generateArrayOfRandomStrings(10);

    }


}
