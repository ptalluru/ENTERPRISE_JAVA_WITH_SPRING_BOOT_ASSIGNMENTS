/**
 * @ptalluru
 * Q4. -> Write a program to print
 *
 *    *                         *
 *    * *                     * *
 *    * * *                 * * *
 *    * * * *             * * * *
 *    * * * * *         * * * * *
 *    * * * * * *     * * * * * *
 *    * * * * * * * * * * * * * *
 *    * * * * * * * * * * * * * *
 *
 */
public class QuestionFour {
    public static void main(String[] args) {
        QuestionFour questionFour =new QuestionFour();
        questionFour.printPattren();
    }

    private void printPattren() {
        int length =8;
        int breadth =14; // to change the size of pattern make sure length is 6 less than breadth
        int rows,columns;

        for (rows=0;rows<length;rows++){
            for (columns=0;columns<breadth;columns++){
                if(columns==0 || rows==length-1 || rows>=columns
                    || columns==breadth-1 || rows+columns>=breadth-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
