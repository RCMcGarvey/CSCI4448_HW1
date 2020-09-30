package Animals.Marsupials;

import Animals.Animal;
import Animals.MakeNoiseStrategy.MakeNoiseStrategy;
import Animals.MakeNoiseStrategy.MakeNoiseStrategy2;

public class Marsupial extends Animal {
    public Marsupial(String _name, String _type) {
        super(_name, _type);
        MakeNoiseStrategy makeNoiseStrategy2 = new MakeNoiseStrategy2();
        super.setMakeNoiseStrategy(makeNoiseStrategy2);
    }
}
