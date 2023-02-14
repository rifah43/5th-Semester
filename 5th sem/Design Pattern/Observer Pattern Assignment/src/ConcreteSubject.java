import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcreteSubject extends Subject{
    try {
        FileWriter fwrite = new FileWriter("input.txt");
        fwrite.write("Written using FileWriter!!!");
        fwrite.close();
    } catch (IOException e) {
        System.out.println("Error While Writing!!!");
        e.printStackTrace();
    }
    FileReader filer = new FileReader("input.txt");
    int i;
    public ConcreteSubject throws IOException {
        while((i=filer.read())!=-1)
            System.out.print((char)i);
        filer.close();
    }
    public void monitorChange(){
        notification();
    }
}
