public class TonerSaveMode implements Itoner{
    private String tonerSavingLevel;
    private Intensity intensity;
    TonerSaveMode (Intensity intensity,String tonerSavingLevel) {
        this.intensity=intensity;
        this.tonerSavingLevel= tonerSavingLevel;
    }
    @Override
    public void saveToner() {
        this.intensity.returnIntensity();
        //intensity interface
    }
}


