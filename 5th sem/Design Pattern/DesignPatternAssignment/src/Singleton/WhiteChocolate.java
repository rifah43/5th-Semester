package Singleton;

public class WhiteChocolate {
    private float litreAmount;
    public void addMilk(float litreAmount){
        this.litreAmount = litreAmount;
        System.out.println(this.litreAmount+"litre milk");
    }
}
