import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @ptalluru
 *
 * 3. WAP to check if the String is Anagram or not.
 *
 * NOTE :- Two strings are called anagrams if they contain same set of characters
 *         but in different order.
 *
 *         EX :- "keep" -->> "peek"
 *               "Mother In Law" -->> "Hitler Woman"
 *               "listen" -->> "silent"
 *               "triangle" -->> "integral"
 */
public class QuestionThree {

    public static void main(String[] args) {

        QuestionThree anagramFinder = new QuestionThree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings in different lines to check whether they are ANAGRAMS : ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (anagramFinder.areAnagram(str1, str2)) {
            System.out.println("The strings --> '"+ str1 + " ,"+ str2 +"' are Anagram of each other");
        } else {
            System.out.println("The strings --> '"+ str1 + " ,"+ str2 +"' are NOT Anagram of each other");
        }
    }

    public boolean areAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        int lengthOfStr1 = str1.length();
        int lengthOfStr2 = str2.length();

        if (lengthOfStr1 != lengthOfStr2) {
            return false;
        }

        char[] string1 = str1.toLowerCase().toCharArray();
        char[] string2 = str2.toLowerCase().toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        for (int i = 0; i < lengthOfStr1; i++){
            if (string1[i] != string2[i])
                return false;
        }
        return true;
    }

}
