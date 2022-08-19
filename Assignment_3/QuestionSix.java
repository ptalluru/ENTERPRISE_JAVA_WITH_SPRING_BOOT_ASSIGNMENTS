import java.util.Scanner;

/**
 *
 * @ptalluru
 *
 * 6. WAP to sort a String Alphabetically.
 *
 */
public class QuestionSix {

    public static void main(String[] args) {
        QuestionSix questionSix = new QuestionSix();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to sort Alphabetically : ");
        String string = scanner.nextLine();
        questionSix.printAlphabetically(string);
    }

    public void printAlphabetically(String string){
        char characterArray[] = string.toCharArray();
        char temporaryVariable;
        for(int i = 0;i < characterArray.length;i++){
            for(int j= i+1;j < characterArray.length;j++){
                if(characterArray[j] < characterArray[i]){
                    temporaryVariable = characterArray[i];
                    characterArray[i] = characterArray[j];
                    characterArray[j] = temporaryVariable;
                }
            }
        }
        System.out.println(characterArray);
    }
}
