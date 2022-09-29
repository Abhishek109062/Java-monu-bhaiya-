package Lec18;

import java.util.Scanner;

public class diceMovesUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPath(0, n, "");
    }

    public static void printPath(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return;
        }

        if (curr > end)
            return;

        for (int x = 1; x <= end; x++) {
            printPath(curr + x, end, ans + x);
        }
    }
}
