/**
 * @ptalluru
 * Q1. -> Write a program(WAP) to print INEURON using pattern programming logic.
 */
public class QuestionOne {
    public static void main(String[] args) {
        QuestionOne questionOne = new QuestionOne();
        questionOne.printIneuronPattern();
    }

    private void printIneuronPattern() {
        int length = 5;
        int rows ,columns;
        for (rows=0;rows<length;rows++){
            //I
            for (columns=0;columns<length;columns++){
                if(rows==0 || rows==length-1 || columns==(length/2)) {
                    System.out.print("I ");
                }
                else{
                    System.out.print("  ");//double space because in above case we are printing * and space so we need to give 2 spaces here
                }
            }
            System.out.print("  ");
            //N
            for (columns=0;columns<length;columns++){
                if(columns==0 || columns==length-1 || rows==columns) {
                    System.out.print("N ");
                }
                else{
                    System.out.print("  ");//double space because in above case we are printing * and space so we need to give 2 spaces here
                }
            }
            System.out.print("  ");
            //E
            for (columns=0;columns<length;columns++){
                if( columns==0 ||rows==0 || rows==(length/2) || rows==length-1) {
                    System.out.print("E ");
                }
                else{
                    System.out.print("  ");//double space because in above case we are printing * and space so we need to give 2 spaces here
                }
            }
            System.out.print("  ");
            //U
            for (columns=0;columns<length;columns++){
                if( (columns==0 && rows!=length-1) || (columns==length-1 && rows!=length-1) || (rows==length-1 && columns!=0 && columns!=length-1)) {
                    System.out.print("U ");
                }
                else{
                    System.out.print("  ");//double space because in above case we are printing * and space so we need to give 2 spaces here
                }
            }
            System.out.print("  ");
            //R
            for (columns=0;columns<length;columns++){
                if(columns==0 || (rows==0 && columns!=length-1) || (rows==length/2 && columns!=length-1) || (columns==(length-1) && rows<(length/2) && rows!=0) || (rows==columns && rows>(length/2))){
                    System.out.print("R ");
                }
                else{
                    System.out.print("  ");//double space because in above case we are printing * and space so we need to give 2 spaces here
                }
            }
            System.out.print("  ");
            //O
            for (columns=0;columns<length;columns++){
                if( (columns==0 && rows!=0 && rows!=length-1) || (columns==length-1 && rows!=0 && rows!=length-1) || (rows==0 && columns!=0 && columns!=length-1) || (rows==length-1 && columns!=0 && columns!=length-1)) {
                    System.out.print("O ");
                }
                else{
                    System.out.print("  ");//double space because in above case we are printing * and space so we need to give 2 spaces here
                }
            }
            System.out.print("  ");
            //N
            for (columns=0;columns<length;columns++){
                if(columns==0 || columns==length-1 || rows==columns) {
                    System.out.print("N ");
                }
                else{
                    System.out.print("  ");//double space because in above case we are printing * and space so we need to give 2 spaces here
                }
            }
            System.out.println("  ");
        }
    }
}