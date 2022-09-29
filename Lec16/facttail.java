package Lec16;

public class facttail {
    public static void main(String[] args) {
        cal(5, 1);
    }

    public static int cal(int n, int fact) {
        if (n == 1)
            return fact;

        return cal(n - 1, fact * n);
    }
}
