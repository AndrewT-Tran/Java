public class JavaBasic{
    //entry point method
    // the JRE needs to call on teh program main method for the porgram to run
    //public is an access modifier and alllows it to be called from anywhere
    //static means that the method belongs to the class and not an instance of the class
    public static void main(String[] args){
        // staic calls the method from the class itself
        System.out.println("Hello World");
        String firstName = "Andrew" ;
        String lastName = "Tran";
        int age = 100;
        boolean isStudent = true;
        double height = 6.1;
        Integer age2 = 26;
    
        System.out.println(Integer.MAX_VALUE + "age: " + age2);
        System.out.println("My name is " + firstName + " " + lastName + "\n" + age2 + "\n" +
            age + "\n" + isStudent + "\n" + height);
        // if (age2 > 21){
        //     //the if statement is expecting a boolean value
        //     System.out.println("You are old enough to drink");
        // // } else if (age2 > 18){
        // //     System.out.println("You are old enough to vote");
        // } else {
        //     System.out.println("You are not old enough to vote or drink");
        // }

        //ternary operator
        System.out.println((age2 >21?("You are old enough to drink"):("You are not old enough to drink")));

        String firstName1 = "Emily";
        String lastName1 = "Tran";

        String fullName1 = firstName1 + lastName1;
        String fullName = firstName1.concat(lastName1);
        System.out.println(fullName);
        System.out.println(fullName1);
        System.out.println(fullName.length());
        // the () indicates that the method is being called not an attribute


        //String Formatting
        String greeting = String.format("Hello %s %s, you are %d years old", firstName1, lastName1, age2);
        //static methods can only be called on the class themselves
        // non static methods can only be called on an instance of the class

        System.out.println(greeting);
        System.out.printf("Hello %s %s, you are %d years old", firstName1, lastName1, age2);
        // %s is a placeholder for a string
        // %d is a placeholder for a number
        // %f is a placeholder for a float
        // %n is a placeholder for a new line
        // %c is a placeholder for a character
        // %b is a placeholder for a boolean
        // %t is a placeholder for a date/time
        

        String name1 = "Andrew";
        String name2 = new String("Andrew");
        String name3 = "Andrew";

        System.out.println(name1 == name2);//false
        System.out.println(name1 == name3);//true
        System.out.println(name1.equals(name3));//false
        // System.out.println(name1.compareTo(name2));
    }
}

