package FactoryMethod;

public class ChocolateMaker {
    public static WhiteChocolate makeWhiteChocolate() {
        return new WhiteChocolate();
    }

    public static DarkChocolate makeDarkChocolate() {

        return new DarkChocolate();
    }

    public static PlainChocolate makePlainChocolate(DarkChocolate darkChocolate, WhiteChocolate whiteChocolate, Fruits fruits) {
        return new PlainChocolate();
    }
    public static Fruits addFruits() {
        return new Fruits();
    }
    public static PlainChocolate makeChocolate(){
        WhiteChocolate whiteChocolate = makeWhiteChocolate();
        DarkChocolate darkChocolate = makeDarkChocolate();
        Fruits fruits = addFruits();
        PlainChocolate plainChocolate = makePlainChocolate(darkChocolate, whiteChocolate, fruits);
        darkChocolate.addCocoa(4.5F);
        fruits.mixFruits(2);
        whiteChocolate.addMilk(.5F);
        plainChocolate.mixAll();
        return plainChocolate;
    }
}

