package oops;

public class construct {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
    }
}
    class Baby{
        String name;
        Baby(){
            System.out.println("I am called object is created");
        }
    }

