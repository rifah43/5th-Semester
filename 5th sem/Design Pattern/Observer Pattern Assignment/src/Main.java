import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("/home/rifahtashfihafaria/IdeaProjects/Observer Pattern Assignment/src/input.txt");
        int i;
        while((i=file.read())!=-1)
            System.out.print((char)i);
        file.close();
        ConcreteObserver concreteObserver1 = new ConcreteObserver("user one");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("user two");
        ConcreteObserver concreteObserver3 = new ConcreteObserver("user three");

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.register(concreteObserver1);
        concreteSubject.register(concreteObserver2);
        concreteSubject.register(concreteObserver3);

        concreteSubject.monitorFile();
    }
}