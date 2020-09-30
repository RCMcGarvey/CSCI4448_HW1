package Employees;

import Animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zookeeper extends ZooEmployee {
    public Zookeeper(int day, ZooAnnouncer announcer) {

        System.out.printf("Zookeeper arrives at Zoo on Day %d.%n", day + 1);
    }
    public List<Anouncement> events = new ArrayList<>();

    public void wakeAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.printf("Zookeeper wakes up %s the %s.%n", animal.name, animal.type);
            // Polymorphism because the appropriate methods of the animals are called
            animal.wakeUp();
        }
    }

    public void rollCall(Animal[] animals) {
        for (Animal animal : animals) {

            System.out.printf("Zookeeper excites %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.makeNoise();
        }
    }

    public void feedAnimals(Animal[] animals) {

        for (Animal animal : animals) {
            System.out.printf("Zookeeper feeds %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.eat();
        }
    }

    public void exerciseAnimals(Animal[] animals) {

        for (Animal animal : animals) {
            System.out.printf("Zookeeper exercises %s the %s.%n", animal.name, animal.type);
            // More polymorphism!
            animal.exercise();
        }
    }

    public void tellAnimalsToSleep(Animal[] animals) {

        for (Animal animal : animals) {
            System.out.printf("Zookeeper puts %s the %s to sleep.%n", animal.name, animal.type);
            // More polymorphism!
            animal.sleep();
        }
    }
}
