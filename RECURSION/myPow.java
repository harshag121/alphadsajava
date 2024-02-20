public class myPow {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / (x * power(x, -(n + 1)));
        } else {
            return x * power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        double x = 2.0; // You can change the base
        int n = 16; // You can change the exponent
        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
