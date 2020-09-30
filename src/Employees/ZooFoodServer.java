package Employees;

import ZooUtil.Announcer;
import ZooUtil.ZooTimer;

import java.util.ArrayList;
import java.util.List;

public class ZooFoodServer extends ZooEmployee implements ZooTimer {
    private List<Announcer> announcers = new ArrayList<>();

    public ZooFoodServer() {
        super("ZooFoodServer");
    }

    @Override
    public void timeEvent(int time) {
        if (time == 8) { // must be 8am
            arriveAtZoo();
        } else if (time == 9) {
            makeFood();
        } else if (time == 12) { // must be 12pm
            serveFood();
        } else if (time == 13) {
            clean();
        } else if (time == 14) {
            makeFood();
        } else if (time == 17) { // must be 5pm
            serveFood();
        } else if (time == 18) {
            clean();
        } else if (time == 19) {
            leaveZoo();
        }
    }

    public void addObserver(Announcer announcer) {
        this.announcers.add(announcer);
    }

    public void removeObserver(Announcer announcer) {
        this.announcers.remove(announcer);
    }

    private void doTask(String task) {
        for (Announcer announcer : this.announcers) {
            announcer.announce("ZooFoodServer", task);
        }
    }

    private void makeFood() {
        System.out.printf("ZooFoodServer is making food.%n");
    }

    private void serveFood() {
        doTask("serve food!");
        System.out.printf("ZooFoodServer is serving food.%n");
    }

    private void clean() {
        System.out.printf("ZooFoodServer is cleaning.%n");
    }
}
