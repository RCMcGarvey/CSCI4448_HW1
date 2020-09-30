package Employees;

import Animals.Animal;
import ZooUtil.ZooTimer;
import java.util.ArrayList;
import java.util.List;

public class Zookeeper extends ZooEmployee implements ZooTimer {
    private List<Announcer> announcers = new ArrayList<>();
    private int time;
    private Animal[] animals;


    @Override
    public void timeEvent(int time) {
        this.time = time;
        if(time == 8){
            wakeAnimals();
        } else if(time == 10) {
            rollCall();
        } else if(time == 13) {
            feedAnimals();
        } else if(time == 15) {
            exerciseAnimals();
        } else if(time == 20) {
            tellAnimalsToSleep();
        }
    }

    public Zookeeper(int day, Animal[] zoo) {
        System.out.printf("Zookeeper arrives at Zoo on Day %d.%n", day + 1);
        this.animals = zoo;
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

    private void wakeAnimals() {
        doTask("wake the animals!");
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
