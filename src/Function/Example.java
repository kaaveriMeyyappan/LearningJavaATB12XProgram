package Function;

public class Example {
    public static void main(String[] args) {
        //=no return type
        non_return_type_func();
        int a = return_type_func();
        System.out.println(a);
    }
    static void non_return_type_func(){
        System.out.println("Hi,Non Return type");
    }
    static int return_type_func(){
        System.out.println("Hi,Return type");
        return 10;
    }
    static boolean return_boolean(){
        return true;
    }
    static byte return_byte(){
        return 100;
    }
    static float return_float(){
        return 3.14f;
    }
}



