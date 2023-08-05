public class Bat extends Mammal {
    public Bat() {
        energy = 300;
    }

    public int fly() {
        energy -= 50;
        System.out.println("The bat is airborne!");
        return energy;
    }

    public int eatHumans() {
        energy += 25;
        System.out.println("The bat is satisfied after eating humans!");
        return energy;
    }

    public int attackTown() {
        energy -= 100;
        System.out.println("The bat has attacked a town!");
        return energy;
    }
}