import Animals.Animal;
import Animals.Felines.Feline;
import Employees.Zookeeper;

import java.util.Scanner;

public class Main {
    public Main() {
        System.out.println("I'm a main constructor.");
    }

    public static void main(String[] args) {
        System.out.println("Starting main function...");

        // Ask for number of days
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of days:");
        int days = Integer.parseInt(scanner.nextLine());

        // Create a Zoo
        Animal testAnimal = new Feline();
        testAnimal.name = "Garfield";
        testAnimal.type = "Cat";
        Animal[] zoo = new Animal[]{testAnimal};

        // Create a Zookeeper
        // Zookeeper zookeeper = new Zookeeper(days);

        // Simulate days at the zoo
        for (int day = 0; day < days; day++) {
            // Create a Zookeeper for this day
            Zookeeper zookeeper = new Zookeeper(day);

            // Make zookeeper do tasks
            zookeeper.wakeAnimals(zoo);
            zookeeper.rollCall(zoo);
            zookeeper.feedAnimals(zoo);
            zookeeper.exerciseAnimals(zoo);
            zookeeper.tellAnimalsToSleep(zoo);
        }
    }
}
