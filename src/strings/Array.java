package strings;

public class Array {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {81,67,51,100,91,92};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("---");
        for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Enhanced for loop");
        for(int mark: marks){
            System.out.println(mark);
        }
    }
}
