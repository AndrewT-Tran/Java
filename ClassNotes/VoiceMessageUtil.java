import java.util.Date;
import java.util.ArrayList;

public class VoiceMessageUtil {
    // classes are made up of attributes and methods
    public String greeting() {
        // public means we can call this method outside of the class and we are
        // returning a string
        return "Hello You";
    }

    public String greeting(String name) {
        return "Hello " + name + "!";

    }

    public String greeting2(String name, int age) {
        return "Hello " + name + " you are, " + age;
    }

    public String greeting3(String name, int age) {
        return String.format("Hello %s you are %d years old", name, age);
    }

    public void getCurrentData() {
        Date today = new Date();
        System.out.println(today);
    }

    public int totalMessages(int[] intArr) {
        int total = 0;
        for (int i = 0; i < intArr.length; i++) {
            total += intArr[i];
        }
        return total;
    }

    public void printMessages(String[] messages) {
        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
        }
        // enhanced for loop
        for (String message : messages) {
            // String <variable name> : <array name>

            System.out.println(message);
        }
    }

    public void printMessages(ArrayList<String> messages) {
        for (int i = 0; i < messages.size(); i++) {
            System.out.println(messages.get(i));
        }
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
