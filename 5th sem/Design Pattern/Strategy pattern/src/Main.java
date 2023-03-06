public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        game.setGameBehaviour(new ActionBehaviour());
        game.processBehaviour();

        game.setGameMusic(new ActionSounds());
        game.processMusic();
    }
}
