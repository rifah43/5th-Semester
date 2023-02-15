import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcreteSubject extends Subject{
    private FileWriter file= new FileWriter("/home/rifahtashfihafaria/IdeaProjects/Observer Pattern Assignment/src/input.txt");
    FileReader filer = new FileReader("/home/rifahtashfihafaria/IdeaProjects/Observer Pattern Assignment/src/input.txt");
    public ConcreteSubject() throws IOException {
        file.write("File Manipulated!!!");
        file.close();
        int i;
        while((i=filer.read())!=-1)
            System.out.print((char)i);
        filer.close();
    }
    public void monitorFile(){
        System.out.println("\nChange done: "+this.file);
        notifyObserver();
    }
}
