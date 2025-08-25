package loose.coupling;

public class LooseCouplingExmp {
    public static void main(String[] args) {
        UserDataProvider dataA = new UserDatabase();
        UserManager userManager = new UserManager(dataA);
        System.out.println(userManager.getUserInfo());
    }
}
