package Abstract;

public class Enumcolors {
    public static void main(String[] args) {
        System.out.println(colors.RED.getHexcode());
    }
}
enum colors{
    RED("#FF000");
    private String hexcode;
    colors(String hexcode){
        this.hexcode = hexcode;
    }
    String getHexcode(){
        return this.hexcode;
    }
}