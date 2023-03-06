public class Game {
    private GameBehaviour gameBehaviour;
    private GameMusic gameMusic;
    public void setGameBehaviour(GameBehaviour gameBehaviour) {
        this.gameBehaviour = gameBehaviour;
    }

    public void processBehaviour() {
        System.out.println(gameBehaviour.performStep());;
    }

    public void setGameMusic(GameMusic gameMusic) {
        this.gameMusic = gameMusic;
    }

    public void processMusic() {
        System.out.println(gameMusic.setMusicType());
    }
}