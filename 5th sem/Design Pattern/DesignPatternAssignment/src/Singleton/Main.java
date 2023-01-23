package Singleton;

public class Main {

    public static void main(String[] args) {
        ChocolateMaker chocolateMaker = ChocolateMaker.getChocolateMaker("John");

        chocolateMaker.isMade();
    }

}
