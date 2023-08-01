import java.util.Random;

public class PuzzleJava {
    public static int[] getTenRolls() {
        int[] rolls = new int[10];
        //here the method is creeated the rolls array whcih is gonna store 10 random numbers
        Random rand = new Random();
        //here we are creating a new instance of teh Random class to get them
        for (int i = 0; i < 10; i++) {
            // the for loop is gonna run 10 times to give us 10 random numbers
            rolls[i] = rand.nextInt(20) + 1;
            // for each loop it will give us a random number between 1 and 20
            // and store it in the rolls array at the index of i
        }
        return rolls;
    }
    public static char getRandomLetter() {
        Random rand = new Random();
        //here we are creating a new instance of teh Random class to get them
        char letter = (char) (rand.nextInt(26) + 'a');
        //here we are creating a new variable called letter and we are gonna store a random letter in it
        return letter;
    }
    public static String generatePassword(int length) {
        String password = "";
        //empty string to store the password
        for (int i = 0; i < length; i++) {
            password += getRandomLetter();
            //for each loop it will add a random letter to the password string
        }
        return password;
    }
    public static String[] getNewPasswordSet(int length) {
    String[] passwordSet = new String[10];
    // here we are setting to store 10 random passwords
    for (int i = 0; i < 10; i++) {
        passwordSet[i] = generatePassword(length);
    }
    return passwordSet;
}
public static void shuffle(int[] arr) {
    Random rand = new Random();
    for (int i = arr.length - 1; i > 0; i--) {
        // for loop iterates through the array backwards and at each iteration it 
        int j = rand.nextInt(i + 1);
        // creates a a random index j betweeo 0 and 1 via the rand.nextInt method
        int temp = arr[i];
        // here we are creating a temp variable to store the value of the array at index i
        arr[i] = arr[j];
        // here we are setting the value of the array at index i to the value of the array at index j
        arr[j] = temp;
        // here we are setting the value of the array at index j to the value of the temp variable
    }
}
}
