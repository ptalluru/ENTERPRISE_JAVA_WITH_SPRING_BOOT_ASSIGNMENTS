import java.util.Scanner;

/**
 * @ptalluru
 *
 * 1. WAP to reverse a String.
 * Input: “iNeuron”
 * Output: “norueNi”
 *
 */
public class QuestionOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String(String will be considered till the 1st space) to reverse : ");
        String input = scanner.next();
        QuestionOne questionOne = new QuestionOne();
        System.out.println(questionOne.reverse(input));
    }

    public String reverse(String input) {
        String output = "";
        for (int i = input.length()-1;i>=0;i--){
            output = output.concat(String.valueOf(input.charAt(i)));
        }
        return output;
    }
}
