public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "uxxdlselxmwyiguugtpsypfudffswvwyswyyiiyywsywvsffdufpysptguugiywmxlesldxxu";

        int i = 0, j = s.length() - 1;
        boolean check = true;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                check = false;
            }
            i++;
            j--;
        }
        System.out.println(check);
    }
}
