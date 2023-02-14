package minidb.xmlParser;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import constants.Constants;

public abstract class XMLFiles {
    protected File xmlFile;
    protected Document doc;
    public XMLFiles(String path) {
        findFile(path);
    }
    public void findFile(String path){
        try {
            xmlFile = new File(path);
            new File(Constants.DB_DIR_PATH).mkdir();
            boolean NoFileFound = xmlFile.createNewFile();
            loadFile(NoFileFound);
        } catch (ParserConfigurationException | SAXException | IOException err) {
            print(String.valueOf(err));
            err.printStackTrace();
        }
    }
    private void loadFile(boolean NoFile) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        if (NoFile) {
            doc = docBuilder.newDocument();
            createFile();
        } else {
            doc = docBuilder.parse(xmlFile);
        }
    }
    abstract void createFile();
    protected void updateFile() {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");

            DOMSource source = new DOMSource(this.doc);
            StreamResult result = new StreamResult(this.xmlFile);
            transformer.transform(source, result);
            print("File updated;");

        } catch (TransformerException err) {
            err.printStackTrace();
        }
    }
    protected void print(String x) {
        System.out.println(x);
    }
}