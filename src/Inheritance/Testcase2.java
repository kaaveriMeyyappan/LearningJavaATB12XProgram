package Inheritance;

public class Testcase2 extends commontoall{
    void runningTC2(){
        startbrowser();
        readexcel();
        readdatabasefile();
        System.out.println("TC2 is running");
        closebrowser();
    }
}
