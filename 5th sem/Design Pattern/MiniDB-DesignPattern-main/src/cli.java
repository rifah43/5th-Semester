import java.util.Scanner;
import minidb.xmlParser.DatabaseFile;
import minidb.xmlParser.RegistryFile;
import constants.*;

public class cli {
    static RegistryFile registry;
    static DatabaseFile CurrentDb;

    public static void main(String[] args) {
        print(constants.HEADING);
        registry = new RegistryFile(constants.DATA_XML_PATH);
        Scanner input = new Scanner(System.in);
        String currentCmd = null;
        while (currentCmd == input.nextLine()) {
             if(!isExitCommand(currentCmd)){
                 break;
             }
            print(constants.CMD_PREFIX);
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
                print(constants.HELP_COMMANDS);
                break;
            }
            case "schema": {
                if (CurrentDb != null) {
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
                    errors.noDatabaseSelected();
                }
                break;
            }

            case "add": {
                if (CurrentDb != null) {
                    CurrentDb.addData(cmdArgs[1]);
                } else {
                    errors.noDatabaseSelected();
                }

                break;
            }

            case "read": {
                if (CurrentDb != null) {
                    if (cmdArgs.length == 1) {
                        CurrentDb.readData();
                    } else {
                        CurrentDb.readData(cmdArgs[1]);
                    }
                } else {
                    errors.noDatabaseSelected();
                }

                break;
            }

            case "drop": {
                registry.deleteDatabase(cmdArgs[1]);
                break;
            }

            case "update": {
                // TODO
                if (CurrentDb != null) {
                }
                break;
            }

            case "delete": {
                if (CurrentDb != null) {
                    CurrentDb.deleteData(cmdArgs[1]);
                } else {
                    errors.noDatabaseSelected();
                }
                break;
            }

            default: {
                print("UNKNOWN COMMAND: " + cmdArgs[0] + "\nType `help;` for commands list");
                break;
            }
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}

// Commands that are available
// ✅ read
// ✅ read id=2
// read id=8..99

// ✅ add 04,cow,25

// ✅ delete id=2
// delete id=5..7

// ✅ schema id, name, age
// schema update id, name,age
// ✅ schema show

// The hardest one:
// update name='cow' where id=2

// Future:
// - import/export databases cmds