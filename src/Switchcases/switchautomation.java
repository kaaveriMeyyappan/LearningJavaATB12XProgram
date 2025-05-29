package Switchcases;

import java.util.Scanner;

public class switchautomation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        //browser = browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("starting the chrome");
                break;
            case "firefox":
                System.out.println("starting firefox");
                break;
            case "edge":
                System.out.println("edge");
            default:
                System.out.println("I have no idea which browser is this");
        }
    }
}
