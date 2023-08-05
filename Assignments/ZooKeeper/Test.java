public class Test {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBananas();
        gorilla.eatBananas();

        gorilla.climb();

        gorilla.displayEnergy();

        Bat bat = new Bat(100);

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHumans();
        bat.eatHumans();

        bat.fly();
        bat.fly();

        bat.displayEnergy();
    }
}
