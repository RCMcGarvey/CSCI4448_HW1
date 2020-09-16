package Animals.Marsupials;

public class DropBear extends Marsupial {
    public DropBear(String _name) {
        super(_name, "Drop Bear");
    }

    public void eat() {
        System.out.println(name + " the " + type + " attacks.");
    }
}
