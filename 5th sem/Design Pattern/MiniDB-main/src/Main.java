import constants.Constants;
import minidb.xmlParser.*;
import minidb.xmlParser.List;

import java.util.*;

public class Main {
    public static Client clientFactory(){
        return new Client();
    }
    public static void main(String[] args) {
        Map<String, Object> commandList = new HashMap<String, Object>();
        Client client= clientFactory();

        commandList.put("New", new New());
        commandList.put("use", new Use());
        commandList.put("list", new List());
        commandList.put("help", new Help());
        commandList.put("schema", new Schema());
        commandList.put("add", new Add());
        commandList.put("read", new Read());
        commandList.put("drop", new Drop());
        commandList.put("delete", new Delete());
        client.inputValue();
        client.getCommandList((HashMap<String, Object>) commandList);
    }
}
