package Encap;

public class Cop {
    public int gun;
    public String icard;
    public  Cop(int gun,String icard){
        this.gun = gun;
        this.icard = icard;
    }
    public void canIshoot(){
        System.out.println("Yes I can shoot");
    }
}
