package Lec18;

public class diceMoves {
    public static void main(String[] args) {
        printPath(0, 4, "");
    }

    public static void printPath(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return;
        }

        if (curr > end)
            return;

        printPath(curr + 1, end, ans + 1);
        printPath(curr + 2, end, ans + 2);
        printPath(curr + 3, end, ans + 3);
    }
}
