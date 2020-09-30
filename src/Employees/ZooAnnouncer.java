package Employees;

public class ZooAnnouncer implements Announcer {
    @Override
    public void announce(String task) {
        System.out.printf("Hi, this is the Zoo Announcer. The Zookeeper is about to %s%n", task);
    }
}
