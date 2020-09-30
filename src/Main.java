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
import Employees.ZooAnnouncer;
import Employees.ZooFoodServer;
import Employees.Zookeeper;
import ZooUtil.ZooClock;
import ZooUtil.ZooTimer;

import java.time.zone.ZoneRulesProvider;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask for number of days
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of days:");
        int days = Integer.parseInt(scanner.nextLine());

        // Create a Zoo
        // Lots of identity below because all these objects are uniquely identified by Java
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

        // Create objects
        ZooClock zooClock = new ZooClock();
        Zookeeper zookeeper = new Zookeeper(zoo);
        ZooAnnouncer zooAnnouncer = new ZooAnnouncer();
        ZooFoodServer zooFoodServer = new ZooFoodServer();

        // Connect observers
        zookeeper.addObserver(zooAnnouncer);
        zooFoodServer.addObserver(zooAnnouncer);
        zooClock.addObserver(zookeeper);
        zooClock.addObserver(zooFoodServer);
        zooClock.addObserver(zooAnnouncer);

        // Simulate days at the zoo
        for (int day = 0; day < days; day++) {
            // Set the day for the Zookeeper
            //     This is an unimportant feature, but it was in the requirements for Project 1,
            //     so we included it again in Project 2.
            zookeeper.setDay(day);

            // Run the clock for the day
            zooClock.runClock();
        }

        // Disconnect observers
        zookeeper.removeObserver(zooAnnouncer);
        zooFoodServer.removeObserver(zooAnnouncer);
        zooClock.removeObserver(zookeeper);
        zooClock.removeObserver(zooFoodServer);
        zooClock.removeObserver(zooAnnouncer);
    }
}
