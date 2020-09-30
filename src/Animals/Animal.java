package Animals;

import Animals.MakeNoiseStrategy.MakeNoiseStrategy;

// Abstract class
abstract public class Animal {

    public Animal(String _name, String _type) {
        name = _name;
        type = _type;
    }

    public String name;
    public String type;
    private MakeNoiseStrategy makeNoiseStrategy;

    // Set the strategy for making noise
    public void setMakeNoiseStrategy(MakeNoiseStrategy strategy) {
        makeNoiseStrategy = strategy;
    }

    // Strategy pattern
    public void makeNoise() {
        makeNoiseStrategy.operation(name, type);
    }

//    public void makeNoise() {
//        System.out.println(name + " the " + type + " makes noise.");
//    }

    // Abstraction because subclasses might override this function
    public void sleep() {
        System.out.println(name + " the " + type + " sleeps.");
    }

    // Abstraction again!
    public void wakeUp() {
        System.out.println(name + " the " + type + " wakes up.");
    }

    // Abstraction again!
    public void exercise() {
        System.out.println(name + " the " + type + " roams.");
    }

    // Abstraction again!
    public void eat() {
        System.out.println(name + " the " + type + " eats.");
    }
}
