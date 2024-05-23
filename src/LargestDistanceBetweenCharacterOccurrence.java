import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * For a given character, find the largest distance of two immediate but not necessarily
 * consecutive occurrences in the input string excluding the whitespaces.
 * <p>
 * For eg.: Input string is: "My name is Shaina."
 * Distance between first and second occurrences of 'a' is 7, and the distance between second and
 * third occurrences of 'a' is 3. Return 7.
 * <p>
 * If there are no or only one occurrence of 'a,' return -1.
 */
public class LargestDistanceBetweenCharacterOccurrence {
    public static void main(String[] args) {
        String s = "Nor had they asked her, even out of courtesy, why she was so pale or why she awoke with purple rings under her eyes in spite of the fact that she expected it, of course, from a family that had always considered her a nuisance, an old rag, a booby painted on the wall, and who were always going around saying thing against her behind her back, calling her churchmouse, calling her Pharisee, calling her crafty, and even Amaranta, may she rest in peace, had said aloud that she was one of those people who could not tell their rectums from their ashes, God have mercy, such words, and she had tolerated everything with resignation because of the Holy Father, but she had not been able to tolerate it anymore when that evil Jose Arcadio Segundo said that the damnation of the family had come when it opened its doors to a stuck up highlander, just imagine, a bossy highlander, Lord save us, a highland daughter of evil spit of the same stripe as the highlanders the government sent to kill workers, you tell me, and he was referring to no one but her, the godchild of the Duke of Alba, a lady of such lineage that she made the liver of president’s wives quiver, a noble dame of fine blood like her, who had the right to sign eleven peninsular names and who was the only mortal creature in that town full of bastards who did not feel all confused at the site of sixteen pieces of silverware, so that her adulterous husband could die of laughter afterword and say that so many knives and forks and spoons were not meant for a human being but for a centipede, and the only one who could tell with her eyes closed when the white wine was served and on what side and in which glass and when the red wine and on what side and in which glass, and not the like the peasant of Amaranta, may she rest in peace, who thought that white wine was served in the day time and red wine at night and the only one on the whole coast who could take pride in the fact that she took care of her bodily needs only in golden chamberpots, so that colonel Aureliano Buendia, may he rest in peace, could have the effrontery to ask her with his Masonic ill humor where she had received that privilege and whether she did not shit shit but shat sweet basil, just imagine, with those very words, and so that Renata, her own daughter, who through an oversight had seen her stool in the bedroom, had answered that even if the pot was all gold and with the coat of arms, what was inside was pure shit, physical shit, and worse even than any other kind because it was stuck-up highland shit, just imagine, her own daughter, so that she never had any illusions about the rest of the family, but in case she had the right to expect a little more consideration from her husband because, for better or for worse, he was her consecrated spouse, her helpmate, her legal despoiler, who took upon himself of his own free and sovereign will the grave responsibility of taking her away from her paternal home, where she never wanted for or suffered from anything, where she wove funeral wreaths as a pastime, since her godfather had sent a letter with his signature and the stamp of his ring on the sealing wax simply to say that the hands of his goddaughter were not meant for tasks of this world except to play the clavichord, and, nevertheless, her insane husband had taken her from her home with all manner of admonitions and warnings and had brought her to that frying pan of hell where a person could not breathe because of the heat, and before she had completed her Pentecostal fast he had gone off with his wandering trunks and his wastrel’s accordion to loaf in adultery with the wretch of whom it was only enough to see her behind, well, that’s been said, to see her wiggle her mare’s behind in order to guess that she was a, that she was a, just the opposite of her, who was a lady in a palace or a pigsty, at the table or in bed, a lady of breeding, God-fearing, obeying His laws and submissive to His wishes, and with whom he could not perform, naturally, the acrobatics and trampish antics that he did with the other one, who, of course, was ready for anything, like the French matrons, and even worse, if one considers well, because they at least had the honesty to put a red light at their door, swinishness like that, just imagine, and that was all that was needed by the only and beloved daughter of Dona Renata Argot and Don Fernando del Carpio, and especially the letter, an upright man, a fine Christian, a Knight of the Order of the Holy Sepulcher, those who received direct from God, the privilege of remaining intact in their graves with their skin smooth like the cheeks of the bride and their eyes alive and clear like emeralds.";
        //String s = "quick brown fox jumps over the lazy dog";

        long startTime = System.nanoTime();
        s = s.replaceAll("\\s", "");
        List<String> stringParts = Arrays.asList(s.split("a"));
        List<Integer> distances = new ArrayList<>();
        for (int i = 1; i < stringParts.size() - 1; i++) {
            distances.add(stringParts.get(i).length() + 1);
        }
        Collections.sort(distances);
        System.out.println(!distances.isEmpty() ? distances.get(distances.size() - 1) : -1);
        long endTime = System.nanoTime();
        long timeInMillis = (endTime - startTime) / 1000000;
        System.out.println("Execution time: " + timeInMillis + "ms");
    }
}
