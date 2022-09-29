import java.util.*;

public class book_allocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int book = sc.nextInt();
            int student = sc.nextInt();
            int bo[] = new int[book];
            for (int x = 0; x < book; x++)
                bo[x] = sc.nextInt();

            Arrays.sort(bo);
            int ans = 0;
            int i = 0, j = bo[bo.length - 1] - bo[0];
            while (i <= j) {
                int mid = (i + j) / 2;

                if (ispossible(bo, mid, student)) {
                    ans = mid;
                    i = mid - 1;
                } else
                    j = mid + 1;

            }
            System.out.println(ans);
        }
    }

    public static boolean ispossible(int page[], int mid, int student) {
        int s1 = 1;
        int readpage = 0;
        int i = 0;
        while (i < page.length) {
            if (readpage + page[i] <= mid) {
                readpage += page[i];
                i++;
            } else {
                readpage = 0;
                s1++;
            }
            if (s1 >= student)
                return true;
        }
        return false;
    }
}
