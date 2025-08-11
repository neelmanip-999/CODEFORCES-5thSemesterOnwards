import java.util.*;

public class Problem_1485A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = Integer.MAX_VALUE;
            for (int add = 0; add < 32; add++) {
                long op = add;
                long nb = b + add;
                if (nb == 1) continue;
                long ca = a;
                while (ca > 0) {
                    ca /= nb;
                    op++;
                }
                ans = Math.min(ans, op);
            }
            System.out.println(ans);
        }
    }
}
