public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 5.8;
        double latte = 5.74;
        double cappuccino = 6.87;
        double jimmyTotal = latte - dripCoffee;
        double roundedTotal = Math.round(jimmyTotal * 100.0) / 100.0;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + readyMessage); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }
        if (isReadyOrder2) {
            System.out.println(generalGreeting + customer2 + readyMessage + "\n" + displayTotalMessage + latte * 2);
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage + "\n" + displayTotalMessage + latte * 2);
        }
        if (isReadyOrder3) {
            System.out.println(generalGreeting + customer3 + displayTotalMessage + roundedTotal);
        } else {
            System.out
                    .println(generalGreeting + customer3 + pendingMessage + "\n" + displayTotalMessage + roundedTotal);
        }
    }
}
