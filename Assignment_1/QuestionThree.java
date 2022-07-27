/**
 * @ptalluru
 * Q3. -> Write a program to print
 *
 *      * * * * * * * * * * * * * *
 *      * * * * * *   * * * * * * *
 *      * * * * *       * * * * * *
 *      * * * *           * * * * *
 *      * * *               * * * *
 *      * *                   * * *
 *      *                       * *
 *      *                         *
 *      *                         *
 *      *                         *
 *      *                         *
 *      *                         *
 *      *                         *
 *      * * * * * * * * * * * * * *
 */
public class QuestionThree {
    public static void main(String[] args) {
        QuestionThree printPattern = new QuestionThree();
        printPattern.printPattern();
    }

    private void printPattern() {
        int length = 14;
        int rows ,columns;

        for (rows=0;rows<length;rows++){
            for (columns=0;columns<length;columns++){
                if(rows==0 || columns==0 || rows==length-1 || columns == length-1
                        || rows+columns<=(length-1)/2
                        || columns-rows>=(length-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println(" ");
        }
    }
}
