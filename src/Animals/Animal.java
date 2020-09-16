package Animals;

abstract public class Animal {

    Animal(String _name, String _type){
        name = _name;
        type = _type;
    }

    protected boolean is_asleep;

    protected String name;

    protected String type;

    void makeNoise() {}

    void sleep() {}

    void wakeUp() {}

    void roam() {}

    void eat() {}

}
