package Employees;

import Animals.Animal;
import ZooUtil.Announcer;
import ZooUtil.ZooTimer;
import java.util.ArrayList;
import java.util.List;

public class Zookeeper extends ZooEmployee implements ZooTimer {
    private List<Announcer> announcers = new ArrayList<>();
    private int day;
    private Animal[] animals;

    public Zookeeper(Animal[] zoo) {
        super("Zookeeper");
        this.animals = zoo;
    }

    @Override
    public void timeEvent(int time) {
        // Encapsulation because the animals responds to the actions of the zookeeper,
        //     but from here you wouldn't be able to know that
        if (time == 8) {
            arriveAtZoo();
        } else if (time == 9) {
            wakeAnimals();
        } else if (time == 10) {
            rollCall();
        } else if (time == 13) {
            feedAnimals();
        } else if (time == 15) {
            exerciseAnimals();
        } else if (time == 19) {
            tellAnimalsToSleep();
        } else if (time == 20) {
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
            announcer.announce("Zookeeper", task);
        }
    }

    public void setDay(int day) {
        this.day = day + 1;
    }

    public void arriveAtZoo() {
        System.out.printf("Zookeeper arrives at the Zoo on Day %d.%n", this.day);
    }

    private void wakeAnimals() {
        doTask("wake up the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper wakes up %s the %s.%n", animal.name, animal.type);
            // Polymorphism because the appropriate methods of the animals are called
            animal.wakeUp();
        }
    }

    private void rollCall() {
        doTask("roll call the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper excites %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.makeNoise();
        }
    }

    private void feedAnimals() {
        doTask("feed the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper feeds %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.eat();
        }
    }

    private void exerciseAnimals() {
        doTask("exercise the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper exercises %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.exercise();
        }
    }

    private void tellAnimalsToSleep() {
        doTask("put the animals to sleep!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper puts %s the %s to sleep.%n", animal.name, animal.type);
            // More polymorphism!
            animal.sleep();
        }
    }
}
