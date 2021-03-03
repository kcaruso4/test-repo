import java.util.ArrayList;
import java.util.Collections;

public class Availability {
    private final User USER;
    private ArrayList<TimeBlock> calendar;

    public Availability(User user){
        this.USER = user;
        this.calendar = new ArrayList<>();
    }

    public Availability(User user, ArrayList<TimeBlock> calendar){
        this.USER = user;
        this.calendar = calendar;
    }

    public void addEvent(TimeBlock e){
        if (!this.calendar.contains(e)) {
            this.calendar.add(e);
        }

        Collections.sort(this.calendar);
    }

    /** Remove by specific TimeBlock object
     * @param e TimeBlock to be removed
     */
    public void removeEvent(TimeBlock e){
        this.calendar.remove(e);
    }

    /** Remove by index in calendar ArrayList
     * @param index position of the TimeBlock to be removed
     */
    public TimeBlock removeEvent(int index){
        return this.calendar.remove(index);
    }

    //Getters

    public User getUser(){
        return this.USER;
    }

    public ArrayList<TimeBlock> getCalendar(){
        return this.calendar;
    }

    //Setters

    public void setAvailability(ArrayList<TimeBlock> calendar) {
        this.calendar = calendar;
    }
}