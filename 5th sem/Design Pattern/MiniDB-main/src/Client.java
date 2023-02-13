import java.util.Scanner;
import minidb.xmlParser.DatabaseFile;
import minidb.xmlParser.RegistryFile;
import constants.*;

public class Client {
    static RegistryFile registry;
    static DatabaseFile CurrentDb;
    public static void main(String[] args) {
        print(Constants.HEADING);
        inputValue();
    }
    public static RegistryFile registryFactory(){
        return new RegistryFile(Constants.DATA_XML_PATH);
    }
    public static void inputValue(){
        registry = registryFactory();
        Scanner input = new Scanner(System.in);
        String currentCmd = null;
        while (currentCmd == input.nextLine()) {
            if(isExitCommand(currentCmd)){
                break;
            }
            print(Constants.CMD_PREFIX);
            long startTime = System.nanoTime();
            cliInputs(currentCmd);
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

    private static void cliInputs(String input) {
        String[] cmdArgs = input.split(" ");
        switch (cmdArgs[0]) {
            case "new": {
                registry.createNewDatabase(cmdArgs[1]);
                break;
            }
            case "use": {
                String path = registry.getDatabasePath(cmdArgs[1], false);

                if (path != null) {
                    CurrentDb = new DatabaseFile(path);
                    CurrentDb.EditMode();
                    print("Successfully loaded Database named: " + cmdArgs[1]);
                } else {
                    print("Database not found");
                }
                break;
            }
            case "list": {
                registry.listAllDatabases();
                break;
            }
            case "help;": {
                print(Constants.HELP_COMMANDS);
                break;
            }
            case "schema": {
                if (!isDBNull(CurrentDb)) {
                    String xy = cmdArgs[1];

                    if (xy.equals("show")) {
                        print(CurrentDb.getSchema());
                    } else {
                        String[] schemaVals = xy.split(",");
                        if (schemaVals.length > 1) {
                            CurrentDb.createSchema(xy);
                        } else {
                            print("There should be atleast 2 columns of data");
                        }
                    }

                } else {
                    Errors.noDatabaseSelected();
                }
                break;
            }

            case "add": {
                if (!isDBNull(CurrentDb)) {
                    CurrentDb.addData(cmdArgs[1]);
                } else {
                    Errors.noDatabaseSelected();
                }

                break;
            }

            case "read": {
                if (!isDBNull(CurrentDb)) {
                    if (cmdArgs.length == 1) {
                        CurrentDb.readData();
                    } else {
                        CurrentDb.readData(cmdArgs[1]);
                    }
                } else {
                    Errors.noDatabaseSelected();
                }
                break;
            }
            case "drop": {
                registry.deleteDatabase(cmdArgs[1]);
                break;
            }

            case "delete": {
                if (!isDBNull(CurrentDb)) {
                    CurrentDb.deleteData(cmdArgs[1]);
                } else {
                    Errors.noDatabaseSelected();
                }
                break;
            }
            default: {
                print("UNKNOWN COMMAND: " + cmdArgs[0] + "\nType `help;` for commands list");
                break;
            }
        }
    }
    public static boolean isDBNull(DatabaseFile CurrentDb){
        if (CurrentDb != null) {
            return true;
        }
        return false;
    }
    private static void print(String x) {
        System.out.println(x);
    }
}
