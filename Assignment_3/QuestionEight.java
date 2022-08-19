import java.util.Scanner;

/**
 * @ptalluru
 *
 * 8. WAP to count number of special characters in a string.
 *
 *    NOTE:- Special Characters(32–47 / 58–64 / 91–96 / 123–126)
 *
 */
public class QuestionEight {

    int specialCharacters = 0;
    public static void main(String[] args) {

        QuestionEight questionEight = new QuestionEight();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to count the special characters : ");
        String string = scanner.nextLine();
        questionEight.countSpecialCharacters(string);

        System.out.println("The String --> "+string+" has "+ questionEight.specialCharacters + " Special characters");
    }

    public void countSpecialCharacters(String string){

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96)|| (ch >= 123 && ch <= 126)) {
                ++specialCharacters;
            }
        }
    }

}
