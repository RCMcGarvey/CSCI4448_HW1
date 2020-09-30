package ZooUtil;

import java.util.ArrayList;
import java.util.List;

public class ZooClock {
    List<ZooTimer> timers = new ArrayList<>();

    public void addObserver(ZooTimer timer) {
        this.timers.add(timer);
    }

    public void removeObserver(ZooTimer timer) {
        this.timers.remove(timer);
    }

    private void stepTime(int time) {
        for (ZooTimer timer : this.timers) {
            timer.timeEvent(time);
        }
    }

    public void runClock() {
        for (int currentTime = 8 ; currentTime < 21; ++currentTime) {
            System.out.printf("THE HOUR IS %d.%n", currentTime);
            stepTime(currentTime);
        }
    }
}
