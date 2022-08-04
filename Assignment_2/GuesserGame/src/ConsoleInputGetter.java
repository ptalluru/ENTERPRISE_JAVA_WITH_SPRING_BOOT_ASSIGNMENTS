import java.util.Scanner;

public class ConsoleInputGetter {

    private final Scanner scanner = new Scanner(System.in);
    public int scannerGuessInt(){
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
    public String scannerPlayerName(){
        return scanner.nextLine();
    }
}
