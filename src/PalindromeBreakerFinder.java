import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;


class Result {

    /**
     * Complete the 'palindromeIndex' function below.
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int palindromeIndex(String s) {
        // Write your code here
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (!(s.charAt(i) == s.charAt(j))) {
                if (palindromeIndex(s.substring(i, j + 1)) == -1) {
                    return i;
                }
                return j;
            }
            i++;
            j--;
        }
        return -1;

    }

}

/**
 * Find index of the character in a string which removed, puts the resultant string in palindrome.
 * Return -1 if the string is already in palindrome.
 */
public class PalindromeBreakerFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Results.txt"));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
