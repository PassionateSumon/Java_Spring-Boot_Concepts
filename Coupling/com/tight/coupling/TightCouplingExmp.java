public class TightCouplingExmp {
    public static void main(String[] args) {
        UserManager usermanager = new UserManager();
        String res = usermanager.getUserInfo();
        System.out.println(res);
    }
}
