public class Square implements IArea{
    private double length;
    public Square(double length)
    {
        this.length = length;
        calculateArea();
    }
    @Override
    public double calculateArea() {
        double len = this.length;
        return len*len;
    }
}
