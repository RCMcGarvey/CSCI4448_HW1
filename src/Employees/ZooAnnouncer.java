package Employees;

public class ZooAnnouncer implements Anouncement {

    @Override
    public void announce(Object event) {
        System.out.println(event);
    }
}
