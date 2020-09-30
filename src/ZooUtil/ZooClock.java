package ZooUtil;

import java.util.ArrayList;
import java.util.List;

public class ZooClock {
    List<ZooTimer> times = new ArrayList<>();
    private int currentTime;

    public void addObserver(ZooTimer timer) {
        this.times.add(timer);
    }

    public void removeObserver(ZooTimer timer) {
        this.times.remove(timer);
    }

    private void runClock(){
        for (currentTime = 8 ;currentTime < 21; ++currentTime) {
            stepTime(currentTime);
        }
    }

    private void stepTime(int time) {
        for (ZooTimer timer : this.times) {
            timer.timeEvent(time);
        }
    }

}
