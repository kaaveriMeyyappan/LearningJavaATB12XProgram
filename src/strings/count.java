package strings;

public class count {
    public static void main(String[] args) {
        String input = "Hello, world.This is a test string";
        // Remove extra spaces and non-word characters
        String cleanedinput = input.replaceAll("[^a-zA-Z0-9\\s]","").replaceAll("\\s+","").trim();
        // Split the string into words
        String[] words = cleanedinput.split("");
        //count no of words
        int wordcount  = words.length;
        System.out.println("Number of words:"+wordcount);
    }
}
