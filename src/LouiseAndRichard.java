import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Solution {
    public static String counterGame(long n) {
        // Write your code here
        int counter = 0;
        while (n > 1) {
            long closestPowerOfTwo = 1;
            if (!((n & (n - 1)) == 0)) {
                while (closestPowerOfTwo * 2 < n) {
                    closestPowerOfTwo *= 2;
                }
                n = n - closestPowerOfTwo;
            } else {
                n = n / 2;
            }
            counter++;
        }
        if (counter % 2 == 0) {
            return "Richard";
        }
        return "Louise";
    }
}

/**
 * Louise and Richard have developed a numbers game. They pick a number and check to see
 * if it is a power of . If it is, they divide it by . If not, they reduce it by the next
 * lower number which is a power of . Whoever reduces the number to  wins the game. Louise
 * always starts.
 * <p>
 * Given an initial value, determine who wins the game.
 */

/**
 * Complete the 'counterGame' function below.
 * <p>
 * The function is expected to return a STRING.
 * The function accepts LONG_INTEGER n as parameter.
 */
public class LouiseAndRichard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Results.txt"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                String result = Solution.counterGame(n);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
