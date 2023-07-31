import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        VoiceMessageUtil vmu = new VoiceMessageUtil();
        // we have to call the class and then the method
        // we are basically importing this class into this file
        System.out.println(vmu.greeting());
        System.out.println(vmu.greeting("Andrew"));
        System.out.println(vmu.greeting2("Andrew", 26));
        vmu.getCurrentData();

        int[] messagesPerDay = new int[4];
        messagesPerDay[0] = 10;
        messagesPerDay[1] = 20;
        messagesPerDay[2] = 30;
        messagesPerDay[3] = 40;
        // int[] messagesPerDay1 = {5, 5 ,5};
        // messagesPerDay1[0]=8;
        String[] messages = { "String1", "String2", "String3" };
        System.out.println(vmu.totalMessages(messagesPerDay));
        // to import the method totalmessages we reference it by the class name vmu is
        // declared above
        vmu.printMessages(messages);
        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Clean the house");
        todoList.add("Wash the dishes");
        vmu.printMessages(todoList);

        int days = 7;
        double costOfLiving = 1000.00;
        // no loss of data
        double totalCostOfLiving = days * costOfLiving;
        System.out.println(totalCostOfLiving);
        // int => double

        // postive loss of data
        int totalCostOfLivingForWeek = (days * (int) costOfLiving);
        // (days * costOfLiving); will give an error becuase there might be a data loss
        // double => int
        System.out.println(totalCostOfLivingForWeek);
    }
}
