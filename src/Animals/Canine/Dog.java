package Animals.Canine;

import java.util.Random;

public class Dog extends Canine {
    public Dog(String _name) {
        super(_name, "Dog");
    }

    public void exercise() {
        // Looked at stack overflow in order to see how to get random chance
        // https://stackoverflow.com/questions/22473931/specifying-random-chance
        Random random = new Random();
        double r = random.nextDouble();
        if (r <= 0.25) {
            System.out.println(super.name + " the " + super.type + " digs.");
        } else {
            super.exercise();
        }
    }
}
