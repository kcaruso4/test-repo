import org.eclipse.jetty.server.handler.ContextHandler;

import java.sql.Time;
import java.util.List;

public abstract class User {
    private static int userCount = 0;
    private int userID;
    private String name;
    private String email;
    private Availability availability;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.userCount += 1;
        this.userID = this.userCount;
    }

    public Meeting createEvent(String name, Time duration,
                               Time timeFrameStart, Time timeFrameEnd, ParticipantList participants){
        return new Meeting(name, duration, timeFrameStart, timeFrameEnd, participants);
    }

    public void createUUID(){}

    public void putBusy(List<Meeting> meetings){}

    public String getName() {return this.name;}

    public String getEmail() {return this.email;}

    public int getUserID() {return this.userID;}

    public void setName(String n) {this.name = n;}

    public void setEmail(String e) {this.email = e;}

}