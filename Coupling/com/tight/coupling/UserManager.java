import loose.coupling.UserDatabase;

public class UserManager {
    private UserDatabase userdatabase = new UserDatabase();

    public String getUserInfo() {
        return userdatabase.getUserDetails();
    }
}
