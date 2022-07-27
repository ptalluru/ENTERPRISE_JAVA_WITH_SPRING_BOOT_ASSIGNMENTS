/**
 * @ptalluru
 * Q2. -> Write a program to print
 *
 * 1 1 1 1
 * 2 2 2 2
 * 3 3 3 3
 * 4 4 4 4
 *
 */
public class QuestionTwo {
    public static void main(String[] args) {
        QuestionTwo printNumberPattern = new QuestionTwo();
        printNumberPattern.printPattern();
    }

    //prints the number pattern i.e if row index is 1 , it prints entire row as 1.
    void printPattern() {
        int rows ,columns;
        int length = 4;
        for(rows=1;rows<=length;rows++){
            for(columns=1;columns<=length;columns++){
                System.out.print(rows+" ");
            }
            System.out.println(" ");
        }
    }
}
