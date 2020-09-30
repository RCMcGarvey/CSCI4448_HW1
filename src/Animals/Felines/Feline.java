package Animals.Felines;

import Animals.Animal;
import Animals.MakeNoiseStrategy.MakeNoiseStrategy;
import Animals.MakeNoiseStrategy.MakeNoiseStrategy1;

import java.util.Random;

public class Feline extends Animal {
    public Feline(String _name, String _type) {
        super(_name, _type);
        MakeNoiseStrategy makeNoiseStrategy1 = new MakeNoiseStrategy1();
        super.setMakeNoiseStrategy(makeNoiseStrategy1);
    }

    // Abstraction because every Feline has the same sleep function
    public void sleep() {
        // Looked at stack overflow in order to see how to get random chance
        // https://stackoverflow.com/questions/22473931/specifying-random-chance
        Random random = new Random();
        double r = random.nextDouble();
        if (r <= 0.3) {
            super.exercise();
        } else if (r <= .6) {
            super.makeNoise();
        } else {
            super.sleep();
        }
    }
}
