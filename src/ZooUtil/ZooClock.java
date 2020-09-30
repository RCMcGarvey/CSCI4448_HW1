package ZooUtil;

import java.util.ArrayList;
import java.util.List;

public class ZooClock {
    List<ZooTimer> timers = new ArrayList<>();
    private int currentTime;

    public void addObserver(ZooTimer timer) {
        this.timers.add(timer);
    }

    public void removeObserver(ZooTimer timer) {
        this.timers.remove(timer);
    }

    private void runClock(){
        for (currentTime = 8 ;currentTime < 21; ++currentTime) {
            stepTime(currentTime);
            System.out.println(currentTime);
        }
    }

    private void stepTime(int time) {
        for (ZooTimer timer : this.timers) {
            timer.timeEvent(time);
        }
    }

}
