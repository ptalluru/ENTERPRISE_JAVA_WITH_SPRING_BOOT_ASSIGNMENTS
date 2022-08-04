class Guesser {
    int guesserNumber;

    RangeValidator rangeValidator = new RangeValidator();

    public int guessNumber() {
        ConsoleInputGetter consoleInputGetter = new ConsoleInputGetter();
        int attempts = 1;
        int maxAttempts = 3;
        System.out.println("Guesser kindly guess the number : ");
        guesserNumber = consoleInputGetter.scannerGuessInt();
        if(rangeValidator.validateRange(guesserNumber)) {
            return guesserNumber;
        }else {
            while (!rangeValidator.validateRange(guesserNumber)){
                if (attempts>=maxAttempts){
                    System.out.println("Guesser you have reached your max limit to guess within the range.....Please ReLaunch the Game to play again!!!");
                    System.exit(0);
                }
                System.out.println("Guesser kindly guess the number within range "+rangeValidator.rangeFrom+" to "+rangeValidator.rangeTo+" again!!" + " and you have only "+(maxAttempts-attempts)+" attempts left to guess with this!!!");
                guesserNumber = consoleInputGetter.scannerGuessInt();
                attempts++;
            }
            return guesserNumber;
        }
    }
}