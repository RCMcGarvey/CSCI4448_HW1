package Animals.Pachyderms;

import Animals.Animal;

import java.util.Random;

public class Pachyderm extends Animal {
    public Pachyderm(String _name, String _type) {
        super(_name, _type);
    }

    // Abstraction because every Pachyderm has the same exercise function
    public void exercise() {
        // Looked at stack overflow in order to see how to get random chance
        // https://stackoverflow.com/questions/22473931/specifying-random-chance
        Random random = new Random();
        double r = random.nextDouble();
        if (r <= 0.25) {
            System.out.println(super.name + " the " + super.type + " charges.");
        } else {
            super.exercise();
        }
    }
}
