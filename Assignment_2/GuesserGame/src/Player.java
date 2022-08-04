class Player {
    String playerName;
    int playerGuessNumber;

    RangeValidator rangeValidator = new RangeValidator();

    public int playerGuessTheNumber() {
        ConsoleInputGetter consoleInputGetter = new ConsoleInputGetter();
        int attempts = 1;
        int maxAttempts = 3;
        System.out.println("Player "+ playerName +" kindly guess the number in the range of "+rangeValidator.rangeFrom+" to "+rangeValidator.rangeTo);
        playerGuessNumber = consoleInputGetter.scannerGuessInt();
        if(rangeValidator.validateRange(playerGuessNumber)) {
            return playerGuessNumber;
        }else {
            while (!rangeValidator.validateRange(playerGuessNumber)){
                if (attempts>=maxAttempts){
                    System.out.println("Player "+ playerName +" you have reached your max limit and you are out of the game!!");
                    break;
                }
                System.out.println("Player "+ playerName +" kindly guess the number within range "+rangeValidator.rangeFrom+" to "+rangeValidator.rangeTo+" again and you are left with "+(maxAttempts-attempts)+" attempts with this!!");
                playerGuessNumber = consoleInputGetter.scannerGuessInt();
                attempts++;
            }
            return playerGuessNumber;
        }
    }
}