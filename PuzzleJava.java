import java.util.ArrayList;
import java.util.Collections;//to use shuffle
import java.util.Random;//to use random


public class PuzzleJava{
    //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    public ArrayList<Integer> printArr(int[] arr){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if (arr[i] > 10){
                newArr.add(arr[i]);
            }
        }

        System.out.println("The sum of all numbers is: " + sum);

        return newArr;
    }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
    public ArrayList<String> printNames(ArrayList<String> arr){
        //shuffle the array
        Collections.shuffle(arr);

        //array to hold names larger than 5 chars
        ArrayList<String> newArr = new ArrayList<String>();

        //print the name of each person
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
            
            if(arr.get(i).length() > 5){
                newArr.add(arr.get(i));
            }
        }

        return newArr;

    }

    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.  
            // To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation
    public void abcShuffle(ArrayList<Character> arr){
        //shuffle array
        Collections.shuffle(arr);
    
        //display last letter of shuffled array
        System.out.println("Last letter in the array: " + arr.get(arr.size() - 1));

        //display first letter of shuffled array
        System.out.println("First letter in the array: " + arr.get(0));

        //display a message if a vowel
        // IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.
        String vowel = "aeiou";
        if (vowel.indexOf(arr.get(0)) != -1){
            System.out.println("The first letter is a vowel");
        }
    }

    // Generate and return an array with 10 random numbers between 55-100.
    // To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
    public int[] randomShuffle(){
        int[] newArr = new int[10];

        Random r = new Random();

        for(int i = 0; i < 10; i++){
            newArr[i] = r.nextInt(100 + 1 - 55) + 55;
        }

        return newArr;
    }   

    // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    // To sort a collection, you can use the sort method of the Collections class.
    public ArrayList<Integer> randomShuffle2(){
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        Random r = new Random();

        for(int i = 0; i < 10; i++){
            newArr.add( r.nextInt(100 + 1 - 55) + 55 );
        }

        //sort array
        Collections.sort(newArr);

        //display minimum and maximum values
        System.out.println("The minimum number is: " + newArr.get(0));
        System.out.println("The maximum number is: " + newArr.get(newArr.size() - 1));

        return newArr;
    }  

    // Create a random string that is 5 characters long.
    public void randomStr(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String newStr = "";
        Random r = new Random();
        int randomIdx;

        for( int i = 0; i < 5; i++){
            randomIdx = r.nextInt(25);
            newStr += letters.charAt(randomIdx);  
        }

        System.out.println(newStr);
    }

    // Generate an array with 10 random strings that are each 5 characters long
    public String[] randomArr(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String newStr = "";
        Random r = new Random();
        int randomIdx;
        String[] newArr = new String[10];

        for( int j = 0; j < 10; j++){
            for( int i = 0; i < 5; i++){
                randomIdx = r.nextInt(25);
                newStr += letters.charAt(randomIdx);  
            }

            newArr[j] = newStr;
            newStr = "";
        }

        return newArr;
    }    
    
}