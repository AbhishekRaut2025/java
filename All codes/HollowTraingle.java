public class HollowTraingle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}