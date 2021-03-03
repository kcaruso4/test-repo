import java.util.Map;

public class ArbitraryScheduleDriver implements  ScheduleDriver {
    private Map<User, Availability> availabilityMap;

    public ArbitraryScheduleDriver(Map<User, Availability> availabilityMap) {
        this.availabilityMap = availabilityMap;
    }

    @Override
    public TimeBlock findBestTime() {
        return new TimeBlock();
    }
}