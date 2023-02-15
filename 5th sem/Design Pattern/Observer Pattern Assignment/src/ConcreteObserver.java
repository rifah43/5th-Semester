public class ConcreteObserver extends Observer{
    private String name;
    ConcreteObserver(String name){
        this.name=name;
    }
    @Override
    public void update(Subject subject) {
        view();
    }
    public void view(){
        System.out.println("viewed change by "+this.name);
    }
}
