package Taskprograms;

public class vowelsconst {
    public static void main(String[] args) {
        //Initializing elements with zero
        int vow = 0, Con = 0;
        String ref= "aeiouGHKL";
        for (int i = 0; i < ref.length(); i++) {
            //check for any special characters const
            if ((ref.charAt(i) >= 'A' && ref.charAt(i) <= 'Z') ||
                    (ref.charAt(i) >= 'a' && ref.charAt(i) <= 'z')) {
                if (ref.indexOf(ref.charAt(i)) != -1)
                    vow++;
                else
                    Con++;


            }
        }

        System.out.println("Number of Vowels = " + vow
                + "\nNumber of Consonants = "
                + Con);
    }


}

