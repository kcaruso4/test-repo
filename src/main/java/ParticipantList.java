import java.util.ArrayList;
import java.util.List;

public class ParticipantList {
    //fields
    private User host;
    private List<User> guests;

    public ParticipantList(User host) {
        this.host = host;
        guests = new ArrayList<>();

    }

    public ParticipantList(User host, List<User> guests) {
        this.host = host;
        this.guests = guests;

    }

    /**
     *
     * @param u User to be added to the list
     */
    public void addGuest(User u) {
        boolean added = guests.add(u);
    }


    /**
     *
     * @param u User to be removed
     * @return return user removed or null if the user was not in the list
     */

    public User removeGuest(User u) {
        if (guests.remove(u)) {
            return u;
        } else {
            return null;
        }
    }


    /**
     *
     * @return returns the number of participants
     */
    public int getNumParticipants() {
        return guests.size();
    }

    /**
     *
     * @return returns the host associated with the list
     */
    public User getHost() {
        return host;
    }


    /**
     *
     * @return returns a list of the guests who plan on attending the meeting
     */
    public List<User> getGuests() {
        return guests;
    }

    /**
     *
     * @param h change host associated with this participant list
     */
    public void setHost(User h) {
        host = h;
    }

    /**
     *
     * @param g completely update the list of guests associated with the list
     */
    public void setGuests(List<User> g) {
        guests = g;
    }


}