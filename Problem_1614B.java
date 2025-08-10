import java.util.*;
class Problem_1614B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            List<int[]> b = new ArrayList<>();
            for (int i = 0; i < n; i++) b.add(new int[]{a[i], i});
            b.sort((x, y) -> Integer.compare(y[0], x[0]));
            int[] ans = new int[n + 1];
            long min = 0;
            int c = 1;
            for (int i = 0; i < n; i++) {
                ans[b.get(i)[1] + 1] = c;
                min += 2L * Math.abs(c) * b.get(i)[0];
                if (c < 0) {
                    c = Math.abs(c) + 1;
                } else {
                    c = -c;
                }
            }
            System.out.println(min);
            for (int v : ans) System.out.print(v + " ");
            System.out.println();
        }
    }
}