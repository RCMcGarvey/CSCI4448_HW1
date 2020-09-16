import Animals.Animal;
import Animals.Canine.Dog;
import Animals.Canine.Wolf;
import Animals.Felines.Cat;
import Animals.Felines.Lion;
import Animals.Felines.Tiger;
import Animals.Marsupials.DropBear;
import Animals.Marsupials.Koala;
import Animals.Pachyderms.Elephant;
import Animals.Pachyderms.Hippo;
import Animals.Pachyderms.Rhino;
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
        Animal[] zoo = new Animal[] {
                new Dog("Duke"),
                new Dog("Drummer"),
                new Wolf("Will"),
                new Wolf("Ware"),
                new Cat("Garfield"),
                new Cat("Crayon"),
                new Lion("Lenny"),
                new Lion("Lucy"),
                new Tiger("Tony"),
                new Tiger("Tammy"),
                new DropBear("Dart"),
                new DropBear("Dolly"),
                new Koala("Karl"),
                new Koala("Kingpin"),
                new Elephant("Eli"),
                new Elephant("Emily"),
                new Hippo("Henry"),
                new Hippo("Herschel"),
                new Rhino("Ryan"),
                new Rhino("Rebecca")
        };

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
