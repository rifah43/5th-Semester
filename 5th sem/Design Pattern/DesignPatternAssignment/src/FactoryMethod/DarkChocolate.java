package FactoryMethod;

public class DarkChocolate {
    private float gramAmount;
    public void addCocoa(float gramAmount){
        this.gramAmount = gramAmount;
        System.out.println(this.gramAmount+"gram Cocoa");
    }
}
