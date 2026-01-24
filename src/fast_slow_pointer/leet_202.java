package fast_slow_pointer;

public class leet_202 {
    public static int findSquare(int n) {
        int sqr = 0;
        while (n > 0) {
            int rem = n % 10;
            sqr = sqr + rem * rem;
            n = n / 10;
        }
        return sqr;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
            if (slow == 1) return true;
            if (slow == fast) return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
