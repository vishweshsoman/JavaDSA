public class CheckPowerOfTwoWithWhileLoop {
    public static boolean isPowerOfTwo(long n) {
        if (n == 0) {
            return false;
        }

        while(n != 1) {
            if(n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        long numberToCheck = 6L; // Change this to the desired number
        if (isPowerOfTwo(numberToCheck)) {
            System.out.println(numberToCheck + " is a power of two.");
        } else {
            System.out.println(numberToCheck + " is not a power of two.");
        }
    }
}