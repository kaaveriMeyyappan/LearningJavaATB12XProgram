package Assignments;

public class Printer {
    void printdata(String data){
        System.out.println("Printing string" + data);
    }
    void printdata(int data){
        System.out.println("printing int" + data);
    }
    void printdata(float data){
        System.out.println("printing float"+ data);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printdata("Hello world");
        printer.printdata(42);
        printer.printdata(3.14f);
    }
}
