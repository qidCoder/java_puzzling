import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJavaTest{
    public static void main(String[] args){
        //create new instance of class
        PuzzleJava runClass = new PuzzleJava();

        //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
        int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(runClass.printArr(arr1));

        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
        String[] arr2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        //add items to an ArrayList
        ArrayList<String> arr2list = new ArrayList<String>();
        for(int i = 0; i < arr2.length; i++){
            arr2list.add(arr2[i]);
        }
        System.out.println(runClass.printNames(arr2list));

        // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.  
                // To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation      
        String arr3 = "abcdefghijklmnopqrstuvwxyz";
        //add items to an ArrayList
        ArrayList<Character> arr3list = new ArrayList<Character>();
        for(int i = 0; i < arr3.length(); i++){
            arr3list.add(arr3.charAt(i));
        }

        runClass.abcShuffle(arr3list);

        // Generate and return an array with 10 random numbers between 55-100.
        // To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
        System.out.println(Arrays.toString(runClass.randomShuffle()));


        // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        // To sort a collection, you can use the sort method of the Collections class.
        System.out.println(runClass.randomShuffle2());

        // Create a random string that is 5 characters long.
        runClass.randomStr();

        // Generate an array with 10 random strings that are each 5 characters long
        System.out.println(Arrays.toString(runClass.randomArr()));
    }
}