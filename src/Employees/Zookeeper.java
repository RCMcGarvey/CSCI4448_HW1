package Employees;

import Animals.Animal;

public class Zookeeper extends ZooEmployee {
    public Zookeeper(int day) {
        System.out.printf("Zookeeper arrives at Zoo on Day %d.%n", day);
    }

    public void wakeAnimals(Animal[] animals) {
        // Wake up them
        for (Animal animal : animals) {
            System.out.printf("Zookeeper wakes up %s the %s.%n", animal.name, animal.type);
            animal.wakeUp();
        }
    }

    public void rollCall(Animal[] animals) {
        // Roll call them
        for (Animal animal : animals) {
            System.out.printf("Zookeeper excites %s the %s.%n", animal.name, animal.type);
            animal.makeNoise();
        }
    }

    public void feedAnimals(Animal[] animals) {
        // Feed them
        for (Animal animal : animals) {
            System.out.printf("Zookeeper feeds %s the %s.%n", animal.name, animal.type);
            animal.eat();
        }
    }

    public void exerciseAnimals(Animal[] animals) {
        // Exercise them
        for (Animal animal : animals) {
            System.out.printf("Zookeeper exercises %s the %s.%n", animal.name, animal.type);
            animal.roam();
        }
    }

    public void tellAnimalsToSleep(Animal[] animals) {
        // Tell them to sleep
        for (Animal animal : animals) {
            System.out.printf("Zookeeper puts %s the %s to sleep.%n", animal.name, animal.type);
            animal.sleep();
        }
    }
}
