import java.util.Scanner;

/**
 *
 * @ptalluru
 *
 * 2. WAP to reverse a sentence while preserving the position.
 * Input : “Think Twice”
 * Output : “kniht eciwt”
 *
 */
public class QuestionTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to reverse : ");
        String input = scanner.nextLine();
        QuestionTwo questionTwo = new QuestionTwo();
        System.out.println(questionTwo.reverseStringAndConvertUppercaseLettersToLowercase(input));
    }

    public String reverseStringAndConvertUppercaseLettersToLowercase(String input) {
        String output = "";
        String[] inputs = input.split(" ");
        for (String inputString : inputs){
            for (int i = inputString.length()-1;i>=0;i--){
                if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z'){
                    output = output+(char)((int)inputString.charAt(i)+32);
                }else {
                    output = output+inputString.charAt(i);
                }
            }
            output = output.concat(" ");
        }
        return output;
    }
}
