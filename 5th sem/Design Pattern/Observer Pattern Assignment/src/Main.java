import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{

        FileReader filer = new FileReader("input.txt");
        int i;
        while((i=filer.read())!=-1)
            System.out.print((char)i);
        filer.close();
    }
    ConcreteSubject concreteSubject = new ConcreteSubject();
    ConcreteObserver concreteObserver1= new ConcreteObserver("user one");
    ConcreteObserver concreteObserver2= new ConcreteObserver("user two");
    ConcreteObserver concreteObserver3= new ConcreteObserver("user three");
    concreteSubject.register(concreteObserver1);
    concreteSubject.register(concreteObserver2);
    concreteSubject.register(concreteObserver3);

    concreteSubject.monitorChange();
}