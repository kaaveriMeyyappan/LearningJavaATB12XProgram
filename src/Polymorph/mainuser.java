package Polymorph;

public class mainuser {
    public static void main(String[] args) {
        User user1 = new Adminuser();
        User user2 = new Regularuser();
        user1.login();
        user2.login();
    }
}
