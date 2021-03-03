import java.util.List;

/*
Represents a temporary user without an account
 */
public class TempUser extends User{

    public TempUser(String name, String email) {
        super(name, email);
    }

    @Override
    public void createUUID() {

    }

}