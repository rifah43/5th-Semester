import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double width;
        double height;
        double length;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the height and width of the Rectangle: ");
        height=scanner.nextDouble();
        width=scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Area of the rectangle: "+ rectangle.calculateArea());

        System.out.println("Enter the length of one side of the square: ");
        length=scanner.nextDouble();
        Square square = new Square(length);
        System.out.println("Area of the square: "+ square.calculateArea());
    }
}
