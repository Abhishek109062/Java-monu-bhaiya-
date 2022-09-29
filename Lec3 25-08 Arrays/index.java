public class index {
    public static void main(String[] args) {
        int ar[] = { 2, 3, -1, 4, 7, 11, 9 };
        int find = 0;
        int ans = -1;
        for (int x = 0; x < ar.length; x++)
            if (ar[x] == find)
                ans = x;

        System.out.println(ans);
    }
}
