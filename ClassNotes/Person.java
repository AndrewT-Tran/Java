// public class Person {
//     private int age;
//     private String name;
//     public static int numberOfPeople = 0;
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//         numberOfPeople++;
//     }
// }


public class Person {
    private int age;
    private String name;
    // the variable is now private
    private static int numberOfPeople = 0;
    public Person(String name, int age) {
        this.name = name; //
        this.age = age;
        numberOfPeople++;
    }

    //it is commmon practice to craete static mmethods to access the variables.
    public static int peopleCount() {
        return numberOfPeople;
    }
}

