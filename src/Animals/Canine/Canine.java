package Animals.Canine;

import Animals.Animal;
import Animals.MakeNoiseStrategy.MakeNoiseStrategy;
import Animals.MakeNoiseStrategy.MakeNoiseStrategy1;

public class Canine extends Animal {
    public Canine(String _name, String _type) {
        super(_name, _type);
        MakeNoiseStrategy makeNoiseStrategy1 = new MakeNoiseStrategy1();
        super.setMakeNoiseStrategy(makeNoiseStrategy1);
    }
}
