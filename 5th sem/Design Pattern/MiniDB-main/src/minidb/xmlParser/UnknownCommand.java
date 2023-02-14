package minidb.xmlParser;

public class UnknownCommand extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        print("UNKNOWN COMMAND: " + cmdArgs[0] + "\nType `help;` for commands list");
    }
}
