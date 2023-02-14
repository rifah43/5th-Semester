public class ConcreteObserver extends Observer{
    private String name;
    ConcreteObserver(String name){
        this.name=name;
    }
    @Override
    public void update() {
        view();
    }
    public void view(){
        System.out.println("Viewed by "+this.name);
    }
}
