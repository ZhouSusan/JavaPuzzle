package PuzzleJava;

import static PuzzleJava.PuzzleJava.*;

public class PuzzleJavaTest {
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
