package Employees;

import ZooUtil.ZooTimer;

// Abstract class
// This class is empty because there is only one subclass
// When there are more subclasses, abstraction will be used
public abstract class ZooEmployee implements ZooTimer {
    private String type;

    public ZooEmployee(String _type) {
        this.type = _type;
    }

    @Override
    public void timeEvent(int time) {
        if (time == 8) {
            arriveAtZoo();
        } else if (time == 20) {
            leaveZoo();
        }
    }

    public void arriveAtZoo() {
        System.out.printf("%s arrives at the Zoo.%n", this.type);
    }

    public void leaveZoo() {
        System.out.printf("%s leaves the Zoo for the day.%n", this.type);
    }
}
