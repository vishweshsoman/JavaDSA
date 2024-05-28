import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * An OCR system has scanned a cheque to convert the handwritten amount into English words representing the number.
 * Below code shall convert any number in a standardized sentence form into its numerical value.
 * The standard form is any number in words followed by its denomination (hundred, thousand, million, etc.)
 * The sentence may or may not contain and/only.
 * Consider the US metric to represent the amount i.e. millions, billions, trillions, etc.
 */
public class ChequeAmountWordsToNumber {
    public static void main(String[] args) {
        String s = "Twenty six Trillion five hundred and thirty six billion nine hundred forty five million three hundred and sixty two thousand five hundred and Eighty six only";

        long startTime = System.currentTimeMillis();

        long amount = 0L;

        Map<String, Long> baseNumbers = new HashMap<>();
        baseNumbers.put("one", 1L);
        baseNumbers.put("two", 2L);
        baseNumbers.put("three", 3L);
        baseNumbers.put("four", 4L);
        baseNumbers.put("five", 5L);
        baseNumbers.put("six", 6L);
        baseNumbers.put("seven", 7L);
        baseNumbers.put("eight", 8L);
        baseNumbers.put("nine", 9L);
        baseNumbers.put("ten", 10L);
        baseNumbers.put("eleven", 11L);
        baseNumbers.put("twelve", 12L);
        baseNumbers.put("thirteen", 13L);
        baseNumbers.put("fourteen", 14L);
        baseNumbers.put("fifteen", 15L);
        baseNumbers.put("sixteen", 16L);
        baseNumbers.put("seventeen", 17L);
        baseNumbers.put("eighteen", 18L);
        baseNumbers.put("nineteen", 19L);
        baseNumbers.put("twenty", 20L);
        baseNumbers.put("thirty", 30L);
        baseNumbers.put("forty", 40L);
        baseNumbers.put("fifty", 50L);
        baseNumbers.put("sixty", 60L);
        baseNumbers.put("seventy", 70L);
        baseNumbers.put("eighty", 80L);
        baseNumbers.put("ninety", 90L);

        Map<String, Long> powers = new HashMap<>();
        powers.put("hundred", 100L);
        powers.put("thousand", 1000L);
        powers.put("million", 1000000L);
        powers.put("billion", 1000000000L);
        powers.put("trillion", 1000000000000L);

        Iterator<String> pieces = List.of(s.toLowerCase().split("\\s")).iterator();

        Long tempAmount = 0L;

        while (pieces.hasNext()) {
            String temp = pieces.next();
            if (temp.equals("and") || temp.equals("only")) {
                continue;
            }
            if (baseNumbers.containsKey(temp)) {
                tempAmount += baseNumbers.get(temp);
            } else if (powers.containsKey(temp) && tempAmount > 0L) {
                tempAmount *= powers.get(temp);
                if (!temp.equals("hundred")) {
                    amount += tempAmount;
                    tempAmount = 0L;
                }
            }
        }

        if (tempAmount > 0L) {
            amount += tempAmount;
        }

        System.out.println("Input: " + s);
        System.out.println("Numeric amount is: " + amount);

        long endTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (endTime - startTime) + "ms");
    }
}
