import java.util.Arrays;

class Umpire {

    int numFromGuesser;
    int numberOfPlayers;

    Player[] listOfPlayers;
    String[] namesOfPlayers;
    String[] winnersList;

    public void collectNumberFromGuesser() {
        Guesser guesser = new Guesser();
        numFromGuesser = guesser.guessNumber();
    }

    public Player[] getPlayersPlayingTheGame(){
        System.out.println("Umpire enter the number of players can be participated in the game : " );
        ConsoleInputGetter consoleInputGetter = new ConsoleInputGetter();
        numberOfPlayers = consoleInputGetter.scannerGuessInt();
        listOfPlayers = new Player[numberOfPlayers];
        namesOfPlayers = new String[numberOfPlayers];
        for(int i=0;i<listOfPlayers.length;i++){
            listOfPlayers[i] = new Player();
            System.out.println("Player register your name to play the game!!");
            listOfPlayers[i].playerName = consoleInputGetter.scannerPlayerName();
            namesOfPlayers[i]=listOfPlayers[i].playerName;
        }
        return listOfPlayers;
    }

    public void collectNumberFromPlayers() {
        for(Player player:listOfPlayers){
            player.playerGuessTheNumber();
        }
    }

    public void compare() {
        int index = 0;
        winnersList = new String[listOfPlayers.length];
        for (int i=0;i<listOfPlayers.length;i++){
            if (numFromGuesser==listOfPlayers[i].playerGuessNumber){
                winnersList[index] = listOfPlayers[i].playerName;
                index++;
            }
        }
        if(index==listOfPlayers.length){
            System.out.println("Game is Tie! all the players guessed correctly");
        }else if (index<listOfPlayers.length && index>0){
            int newSize = 0;
            for (int i = 0; i < winnersList.length; i++)    {
                if (winnersList[i] != null) {
                    newSize++;
                }
            }
            String[] resultList = new String[newSize];
            int resultIndex = 0;
            for (int j=0;j<winnersList.length;j++){
                if (winnersList[j] != null && resultIndex<newSize){
                    resultList[resultIndex] = winnersList[j];
                    resultIndex++;
                }
            }
            System.out.println("Player(s) "+ Arrays.toString(resultList)+" won the game!!!");
        }else {
            System.out.println("Game lost,no player guessed correctly!! Try again");
        }
    }
}