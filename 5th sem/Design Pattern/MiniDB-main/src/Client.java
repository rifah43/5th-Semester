import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import constants.Constants;
import minidb.xmlParser.Command;
import minidb.xmlParser.DatabaseFile;
import minidb.xmlParser.RegistryFile;
import minidb.xmlParser.UnknownCommand;
import java.util.*;
public class Client {
    private static Map<String, Object> commandList = new HashMap<String, Object>();
    static RegistryFile registry;
    static DatabaseFile CurrentDb;
    public static void inputValue(){
        registry = registry.getRegistry();
        Scanner input = new Scanner(System.in);
        String currentCmd = null;
        while (currentCmd == input.nextLine()) {
            if(isExitCommand(currentCmd)){
                break;
            }
            print(Constants.CMD_PREFIX);
            long startTime = System.nanoTime();
            clientInputs(currentCmd);
            long endTime = System.nanoTime();
            getExecutionTime(startTime, endTime);
        }
        input.close();
    }
    public static boolean isExitCommand(String currentCmd){
        if (currentCmd.equals("exit;")) {
            return true;
        }
        return false;
    }
    public static void getExecutionTime(long startTime,long endTime){
        long executionTime = (endTime - startTime) / 1000000;
        print("\nExecution Time: " + executionTime + "ms");
    }

    private static void clientInputs(String input) {
        String[] cmdArgs = input.split(" ");
        try {
            Object object=commandList.get(cmdArgs[0]);
            object.executeCommand(CurrentDb,registry,cmdArgs[1]);
        }
        catch(Exception e)
        {
            Command unknownCommand = new UnknownCommand();
            unknownCommand.executeCommand(CurrentDb,registry,cmdArgs);
        }
    }
    public void getCommandList(HashMap<String, Object> commandList) {
        this.commandList = commandList;
    }
    private static void print(String x) {
        System.out.println(x);
    }
}