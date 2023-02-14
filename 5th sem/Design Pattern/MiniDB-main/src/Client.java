import java.util.Scanner;

import constants.Constants;
import minidb.xmlParser.Command;
import minidb.xmlParser.DatabaseFile;
import minidb.xmlParser.RegistryFile;

public class Client {
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
            (Command)command.get(cmdArgs[0])).executeCommand(CurrentDb,registry,cmdArgs);
        }
        catch(Exception e)
        {
            Command error_command = new CommandNotFound();
            error_command.execute(CurrentDb,registry,cmdArgs);
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}