package minidb.xmlParser;

public class Drop extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        registry.deleteDatabase(cmdArgs[1]);
    }
}
