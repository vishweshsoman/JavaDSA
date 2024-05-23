public class PowerOfTwoChecker {
    public static boolean isPowerOfTwo(long num) {
        // A number is a power of two if and only if it has exactly one bit set.
        // For positive integers, this means it should be greater than zero.
        return num > 0 && (num & (num - 1)) == 0;
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