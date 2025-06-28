package Codingchallenge;

public class Builder {

        private static final int ITERATIONS = 1000;

        public static void main(String[] args) {
            // String concatenation with '+'
            long startTime = System.nanoTime();
            String s = "";
            for (int i = 0; i < ITERATIONS; i++) {
                s += "a";
            }
            long duration = System.nanoTime() - startTime;
            System.out.println("String (+) time: " + duration / 1000+ " ms");

            // StringBuilder
            startTime = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ITERATIONS; i++) {
                sb.append("a");
            }
            duration = System.nanoTime() - startTime;
            System.out.println("StringBuilder time: " + duration / 1000+ " ms");

            // StringBuffer
            startTime = System.nanoTime();
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < ITERATIONS; i++) {
                sbuf.append("a");
            }
            duration = System.nanoTime() - startTime;
            System.out.println("StringBuffer time: " + duration / 1000 + " ms");
        }
    }


