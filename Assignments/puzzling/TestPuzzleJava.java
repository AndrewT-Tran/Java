import java.util.Arrays;

public class TestPuzzleJava {
    public static void main(String[] args) {
        // Test generatePassword method
        System.out.println("Random password of length 8: " + PuzzleJava.generatePassword(8));
        System.out.println("Random password of length 12: " + PuzzleJava.generatePassword(12));

        // Test getNewPasswordSet method
        String[] passwordSet = PuzzleJava.getNewPasswordSet(10);
        System.out.println("Random password set of length 8:");
        System.out.println(Arrays.toString(passwordSet));

        // Test shuffle method
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        PuzzleJava.shuffle(arr);
        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }
}