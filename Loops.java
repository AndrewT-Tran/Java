import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");
        System.out.println(snacks);
        // for (int i = 0; i < snacks.size(); i++) {
        // if (snacks.get(i).charAt(0) == 'A') {
        // System.out.println(String.format("i = %d AND we are removing %s", i,
        // snacks.get(i))); // new line
        // snacks.remove(i);
        // }
        // }

        // for (int i = 0; i < snacks.size(); i++) {
        // System.out.println(String.format("i = %d AND snack = %s", i, snacks.get(i)));
        // // new line
        // if (snacks.get(i).charAt(0) == 'A') {
        // System.out.println(String.format("i = %d AND we are removing %s", i,
        // snacks.get(i)));
        // snacks.remove(i);
        // }
        // }

        for (int i = 0; i < snacks.size(); i++) {
            if (snacks.get(i).charAt(0) == 'A') {
                snacks.remove(i);
                i--; // Here we move one step back
            }
        }

        System.out.println(snacks); // [Pretzels, Yogurt] we finally get our desired product
        // our goal of this is learn to debug
    }
}˜˜
