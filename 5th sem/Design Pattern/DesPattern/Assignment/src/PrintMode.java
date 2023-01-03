abstract class PrintMode {
    // Fields
    private int numPages;
    private int pageSize;
    private Orientation orientation;
    private int colorIntensity;
    private double costPerPage;

    // Getter and setter methods

    // Abstract methods
    abstract void saveToner();
    abstract void savePage();
    abstract void boost();
}

enum Orientation {
    PORTRAIT, LANDSCAPE
}