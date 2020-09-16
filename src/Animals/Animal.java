package Animals;

// Abstract class
abstract public class Animal {
    public Animal(String _name, String _type) {
        name = _name;
        type = _type;
    }

    // is_asleep is encapsulated because it is only reachable by this class and its subclasses
    protected boolean is_asleep;
    public String name;
    public String type;

    // Abstraction because subclasses might override this function
    public void makeNoise() {
        System.out.println(name + " the " + type + " makes noise.");
    }

    // Abstraction again!
    public void sleep() {
        System.out.println(name + " the " + type + " sleeps.");
        is_asleep = true;
    }

    // Abstraction again!
    public void wakeUp() {
        System.out.println(name + " the " + type + " wakes up.");
        is_asleep = false;
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
