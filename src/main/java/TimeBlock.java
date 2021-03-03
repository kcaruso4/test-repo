import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeBlock implements Comparable<TimeBlock>{
    /** TimeBlock Structural fields using ZonedDateTime
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html">ZonedDateTime class</a>
     */
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private long duration;
    //TODO: private Frequency frequency;

    /** TimeBlock categorical fields
     */
    private boolean isConfirmed;

    /**
     * The constructors we need to create/use depends on how the date time info gets collected
     * @param startTime ZonedDateTime instance
     * @param endTime ZonedDateTime instance
     */
    public TimeBlock(ZonedDateTime startTime, ZonedDateTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = startTime.until(endTime, ChronoUnit.MINUTES);
    }

    /**
     * @param startTime string to be parsed into ZonedDateTime obj
     *                  such as 2007-12-03T10:15:30+01:00[Europe/Paris]
     * @param endTime " " " " "
     *
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_ZONED_DATE_TIME">
     *     uses DateTimeFormatter.ISO_ZONED_DATE_TIME</a>
     */
    public TimeBlock(String startTime, String endTime){
        this.startTime = ZonedDateTime.parse(startTime);
        this.endTime = ZonedDateTime.parse(endTime);
    }

    public int compareDuration(TimeBlock e){
        return Double.compare(this.duration, e.duration);
    }

    public boolean contains(TimeBlock e){
        return this.startTime.compareTo(e.startTime) < 0
                && this.endTime.compareTo(e.endTime) > 0;
    }

    //Getters

    public ZonedDateTime getStartTime(){
        return this.startTime;
    }

    public ZonedDateTime getEndTime(){
        return this.endTime;
    }

    //Setters

    public void setStartTime(ZonedDateTime startTime){
        this.startTime = startTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public int compareTo(TimeBlock e){
        if (e == null) {
            throw new NullPointerException();
        }

        if (getStartTime().compareTo(e.getStartTime()) < 0) {
            return -1;
        } else if (getStartTime().compareTo(e.getStartTime()) == 0) {
            return getEndTime().compareTo(e.getEndTime()) <= 0 ? 0 : 1;
        } else {
            return 1;
        }
    }

    public boolean equals(TimeBlock e){
        return this.compareTo(e) == 0;
    }


}