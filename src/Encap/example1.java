package Encap;

public class example1 {
    public static void main(String[] args) {
        vwologin v1 = new vwologin("kaaveri","test123");
        //System.out.println(v1.password);
        v1.setPassword("Test222",false);
        System.out.println(v1.getPassword());
    }

}
class vwologin{
    private String username;
    private String password;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password,boolean isadmin) {
       if (isadmin){
           this.password = password;
    }
    else{
            System.out.println("Not allowed");
        }
    }

    public vwologin(String username, String password) {

        this.username = username;
        this.password = password;
    }



}
