package Employees;

import Animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zookeeper extends ZooEmployee implements Timer {
    private List<Announcer> announcers = new ArrayList<>();

    public Zookeeper(int day) {
        System.out.printf("Zookeeper arrives at Zoo on Day %d.%n", day + 1);
    }

    public void addObserver(Announcer announcer) {
        this.announcers.add(announcer);
    }

    public void removeObserver(Announcer announcer) {
        this.announcers.remove(announcer);
    }

    private void doTask(String task) {
        for (Announcer announcer : this.announcers) {
            announcer.announce(task);
        }
    }

    public void wakeAnimals(Animal[] animals) {
        doTask("wake the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper wakes up %s the %s.%n", animal.name, animal.type);
            // Polymorphism because the appropriate methods of the animals are called
            animal.wakeUp();
        }
    }

    public void rollCall(Animal[] animals) {
        doTask("roll call the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper excites %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.makeNoise();
        }
    }

    public void feedAnimals(Animal[] animals) {
        doTask("feed the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper feeds %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.eat();
        }
    }

    public void exerciseAnimals(Animal[] animals) {
        doTask("exercise the animals!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper exercises %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.exercise();
        }
    }

    public void tellAnimalsToSleep(Animal[] animals) {
        doTask("put the animals to sleep!");
        for (Animal animal : animals) {
            System.out.printf("Zookeeper puts %s the %s to sleep.%n", animal.name, animal.type);
            // More polymorphism!
            animal.sleep();
        }
    }
}
