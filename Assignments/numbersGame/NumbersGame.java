import java.util.Random;
public class NumbersGame {
    public static void main(String[] args){
        System.out.println("Hello, human. I am thinking of a number between 1 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");
        int numGuesses = 0;
        while(numGuesses < 3){
            int answer = new Random().nextInt(9) + 1;
            //Random.nextInt(int bound) method is generating a random integer between 0 and 9, and then adding 1 to it to get a number between 1 and 10. 
            //the nextInt method generates a random integer between 0 (inclusive) and the specified bound (exclusive)
            //so it can a value generate 0 or 10, which are outside the range of valid guesses.
            // we can modify the Random.nextInt(int bound) method to generate a random integer between 1 and 9 instead of 0 and 9. 
            //We can then add 1 to the result to get a number between 1 and 10.
            String guess = System.console().readLine();
            if(guess == null || guess.isEmpty()){
                System.out.println("Please enter a valid input.");
                continue;
            }
            if(guess.equals("q")){
                System.out.println("I knew you didn't have it in you.");
                System.out.println("Shutting down...");
                break;
            }
            //try-catch block around the Integer.parseInt(guess) line to catch the NumberFormatException and handle it 
            try{
                int guessInt = Integer.parseInt(guess);
                if(guessInt < 1 || guessInt > 10){
                    System.out.println("Please enter a number between 1 and 10.");
                    continue;
                }
                if(guessInt == answer){
                    System.out.println("Lucky guess! But can you do it again?");
                    break;
                }else{
                    System.out.println("Swing and a miss! Keep trying...");
                    numGuesses++;
                }
            }catch(NumberFormatException e){
                //dd a check to see if the user input is empty or null, and prompt the user to enter a valid input if it is.
                System.out.println("Please enter a valid input.");
            }
        }
        if(numGuesses == 3){
            System.out.println("You have failed. Better luck next time!");
        }
        System.out.println("Game over. Shutting down...");
    }
}