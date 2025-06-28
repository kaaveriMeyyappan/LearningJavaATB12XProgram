package Abstract;

public class example3 {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);
    }
}
class Student{
    int age;
    static String course_name ="java";
    public Student(int age_c){
        this.age = age_c;
    }
    static void m1(){
        System.out.println("I am static method");
    }
}
