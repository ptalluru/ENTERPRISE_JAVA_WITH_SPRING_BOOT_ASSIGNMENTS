import java.util.Scanner;

/**
 *
 * @ptalluru
 *
 * 7. WAP to count the number of Vowels and Consonants of a String value.
 *
 */
public class QuestionSeven {
    int vowels = 0, consonants = 0;

    public static void main(String[] args) {

        QuestionSeven questionSeven = new QuestionSeven();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to count the number of Vowels and Consonants : ");
        String string = scanner.nextLine();
        questionSeven.countVowelsAndConsonants(string);

        System.out.println("The String --> '"+string+"' has ");
        System.out.println("Vowels: " + questionSeven.vowels);
        System.out.println("Consonants: " + questionSeven.consonants);
    }

    public void countVowelsAndConsonants(String string){
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }
    }
}
