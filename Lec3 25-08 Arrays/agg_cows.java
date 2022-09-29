import java.util.*;

public class agg_cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int stall = sc.nextInt();
            int cow = sc.nextInt();
            int st[] = new int[stall];
            for (int x = 0; x < stall; x++)
                st[x] = sc.nextInt();

            Arrays.sort(st);
            int ans = 0;
            int i = 0, j = st[st.length - 1] - st[0];
            while (i <= j) {
                int mid = (i + j) / 2;

                if (ispossible(st, mid, cow)) {
                    ans = mid;
                    i = mid + 1;
                } else
                    j = mid - 1;

            }
            System.out.println(ans);
        }
    }

    public static boolean ispossible(int st[], int mid, int cow) {
        int count = 1;
        int index = 0;
        for (int x = 1; x < st.length; x++) {
            if ((st[x] - st[index]) >= mid) {
                index = x;
                count++;
            }
            if (count >= cow)
                return true;
        }

        return false;
    }
}
