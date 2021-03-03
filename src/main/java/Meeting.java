import java.sql.Time;
import java.util.List;
import java.util.NoSuchElementException;
//import User;

public class Meeting {
    private Time duration;
    private Time timeFrameStart;
    private Time timeFrameEnd;
    private ParticipantList participants;
    private boolean visible = true;
    private boolean isConfirmed = false;
    private static int meetingCount = 0;
    private int meetingID;

    private String name;
    private String description;
    private String location;
    //Make an ID class, creates unique ids for meetings and users

    public Meeting(String name, Time duration, Time timeFrameStart, Time timeFrameEnd, ParticipantList participants) {
        this.name = name;
        this.duration = duration;
        this.timeFrameStart = timeFrameStart;
        this.timeFrameEnd = timeFrameEnd;
        this.participants = participants;
        meetingID = meetingCount++;
    }

    public Meeting(String name, String description, String location, Time duration, Time timeFrameStart, Time timeFrameEnd, ParticipantList participants) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.duration = duration;
        this.timeFrameStart = timeFrameStart;
        this.timeFrameEnd = timeFrameEnd;
        this.participants = participants;
        meetingID = meetingCount++;
    }

    public void editDescription(String description) {
        this.description = description;
    }

    public void editName(String name) {
        this.name = name;
    }

    public void editLocation(String location) {
        this.location = location;
    }

    public void editVisibility(boolean visible) {
        this.visible = visible;
    }

    public void confirmMeeting(boolean confirmed) {
        this.isConfirmed = confirmed;
    }

    public void addParticipant() {
        this.participants.addParticipant();
    }

    public boolean removeParticipant() {
        return this.participants.removeParticipant();
    }

    public String getName() {
        return this.name;
    }

    public List<User> getParticipants() {
        return this.participants.getGuests();
    }
}