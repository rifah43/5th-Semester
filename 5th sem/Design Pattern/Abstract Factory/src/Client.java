public class Client {
    public static void main(String[] args) {
        Window motifWindow = new MotifWidgetFactory().createWindow();
        motifWindow.printerW();
    }
}