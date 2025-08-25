package loose.coupling;

public class UserDatabase implements UserDataProvider {
    
    @Override
    public String getUserDetails() {
        return "Hey this is the user details.";
    }
}
