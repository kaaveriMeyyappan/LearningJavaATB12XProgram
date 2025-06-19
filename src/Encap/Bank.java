package Encap;

public class Bank {
    public static void main(String[] args) {
        ICICI BK = new ICICI("HDFC", 5l);
        System.out.println(BK.bank_name);
        System.out.println(BK.getBal());
        BK.setBal(5000);
        System.out.println(BK.getBal());

    }
}
class ICICI {

    private String name;
    private long bal;
    public String bank_name = "ICICI";
    public ICICI(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }


}


