public class AlfredTest {
    /*
     * This main method will always be the launch point for a Java application
     * For now, we are using the main to test all our
     * AlfredQuotes methods.
     */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        // String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        // System.out.println(testGuestGreeting); // prints "Hello, Beth Kane. Lovely to
        // see you."
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        System.out.println(testDateAnnouncement);
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        System.out.println(alexisTest);
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        System.out.println(alfredTest);
        String notRelevantTest = alfredBot
                .respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");
        System.out.println(notRelevantTest);

        // Print the greetings to test.
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        System.out.println(testGuestGreeting);
        String testReverseString = alfredBot.reverseString("Hello, this is my Bonus!");
        System.out.println(testReverseString); // prints "!sunoB ym si siht ,olleH"
    }
}
