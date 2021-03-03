import java.util.ArrayList;
import java.util.List;

/*
Represents a user with a profile using the application
 */
public class UserProfile extends User{
    private boolean isAdmin;
    private List<Meeting> myEvents;

    public UserProfile(String name, String email) {
        super(name, email);
        myEvents = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        myEvents.add(meeting);
    }

    public void removeMeeting(Meeting meeting) {
        myEvents.remove(meeting);
    }

    public List<Meeting> getUserEvents() {
        return this.myEvents;
    }

    @Override
    public void createUUID() {

    }
}