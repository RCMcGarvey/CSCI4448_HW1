package Employees;

import ZooUtil.Announcer;

public class ZooAnnouncer extends ZooEmployee implements Announcer {
    public ZooAnnouncer() {
        super("ZooAnnouncer");
    }

    @Override
    public void announce(String employee, String task) {
        System.out.printf("Hi, this is the Zoo Announcer. The %s is about to %s%n", employee, task);
    }
}
