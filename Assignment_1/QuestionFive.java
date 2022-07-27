/**
 *
 * @ptalluru
 *  Q5. -> Write a program to print
 *
 *
 *
 */
public class QuestionFive {
    public static void main(String[] args) {
        QuestionFive questionFive =new QuestionFive();
        questionFive.printPattren();
    }

    private void printPattren() {
        int length =14;
        int rows,columns;

        for(rows=0;rows<length;rows++){
            for (columns=0;columns<length;columns++){
                if(rows==0 || rows==length-1 || columns==0
                    || rows-columns>=(length-1)/2
                    || rows+columns<=(length-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
