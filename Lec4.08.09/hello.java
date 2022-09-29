import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        String s = "Hello";
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5 - x + 1; y++) {
                System.out.println(s.substring((y - 1), (y - 1 + x)));
            }
            // System.out.println();
        }
    }
}
