package Animals;

abstract public class Animal {
    public Animal(String _name, String _type) {
        name = _name;
        type = _type;
    }

    protected boolean is_asleep;
    public String name;
    public String type;

    public void makeNoise() {
        System.out.println(name + " the " + type + " makes noise.");
    }

    public void sleep() {
        System.out.println(name + " the " + type + " sleeps.");
        is_asleep = true;
    }

    public void wakeUp() {
        System.out.println(name + " the " + type + " wakes up.");
        is_asleep = false;
    }

    public void exercise() {
        System.out.println(name + " the " + type + " roams.");
    }

    public void eat() {
        System.out.println(name + " the " + type + " eats.");
    }
}
