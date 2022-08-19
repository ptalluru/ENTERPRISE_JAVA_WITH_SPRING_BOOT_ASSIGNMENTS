import java.util.Scanner;

/**
 *
 * @ptalluru
 *
 * 5. WAP to print repeatedly occurring characters in the given String.
 *
 */
public class QuestionFive {

    public static void main(String[] args) {
        QuestionFive questionFive = new QuestionFive();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to print the repeatedly occurring characters : ");
        String string = scanner.nextLine();
        questionFive.printRepeatedlyOccurringChars(string);

    }

    public void printRepeatedlyOccurringChars(String string){
        int count;
        char[] characterOccurrences = string.toCharArray();
        System.out.println("Repeatedly occurring character(s) in a given string is/are : ");
        for (int i = 0; i < characterOccurrences.length; i++) {
            count = 1;
            for (int j = i + 1; j < characterOccurrences.length; j++) {
                if (characterOccurrences[i] == characterOccurrences[j] && characterOccurrences[i] != ' ') {
                    count++;
                    characterOccurrences[j] = '0';
                }
            }

            if (count > 1 && characterOccurrences[i] != '0')
                System.out.println(characterOccurrences[i]);
        }

    }
}
