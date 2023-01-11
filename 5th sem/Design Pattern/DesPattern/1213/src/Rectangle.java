public class Rectangle implements IArea{
    private double height;
    private double width;
    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
        calculateArea();
    }
    @Override
    public double calculateArea() {
        double hei = this.height;
        double wid = this.width;
        return hei*wid;
    }
}
