public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        System.out.println("**********************************");
        System.out.println("***** WELCOME TO GUSSER GAME *****");
        System.out.println("**********************************");
        umpire.collectNumberFromGuesser();
        umpire.getPlayersPlayingTheGame();
        umpire.collectNumberFromPlayers();
        umpire.compare();
    }
}