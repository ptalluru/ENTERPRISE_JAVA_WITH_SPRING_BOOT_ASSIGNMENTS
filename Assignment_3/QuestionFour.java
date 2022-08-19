import java.util.Scanner;

/**
 *
 * @ptalluru
 *
 * 4. WAP to check if the String is a Pangram or not.
 *
 *
 *  NOTE :- The string is called a pangram if it contains all the alphabets
 *          from a to z or A to Z, ignoring the case sensitivity.
 *
 *          EX :- "Abcdefghijklmnopqrstuvwxyz".
 *                "Pack my box with five dozen liquor jugs".
 *                "The quick brown fox jumps over the lazy dog".
 *                "My ex pub quiz crowd gave joyful thanks".
 *                "Cozy sphinx waves quart jug of bad milk".
 *                "Fix problem quickly with galvanized jets".
 */
public class QuestionFour {

    public int size = 26;

    public static void main(String[] args) {

        QuestionFour pangramFinder = new QuestionFour();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check whether it is PANGRAM or NOT : ");
        String stringToFindPangram = scanner.nextLine();

        int stringLength = stringToFindPangram.length();

        if (stringLength >= 26 && pangramFinder.checkAllLetter(stringToFindPangram, stringLength)) {
            System.out.println("The String --> '"+stringToFindPangram+"' is an ANAGRAM");
        }else {
            System.out.println("The String --> '"+stringToFindPangram+"' is NOT an ANAGRAM");
        }
    }

    public boolean checkAllLetter(String string, int length) {
        string = string.toLowerCase();
        boolean[] present = new boolean[size];
        for (int i = 0; i < length; i++) {
            if (isLetter(string.charAt(i))) {
                int letter = string.charAt(i) - 'a';
                present[letter] = true;
            }
        }
        for (int i = 0; i < size; i++) {
            if (!present[i])
                return false;
        }
        return true;
    }

    public boolean isLetter(char ch) {
        if(ch>=97 && ch<=122){
            return true;
        }
        return false;
    }
}
