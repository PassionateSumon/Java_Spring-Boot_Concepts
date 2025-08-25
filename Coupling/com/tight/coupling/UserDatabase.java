import loose.coupling.UserDataProvider;

public class UserDatabase implements UserDataProvider {
    public String getUserDetails() {
        return "Hey this is the user details.";
    }
}
