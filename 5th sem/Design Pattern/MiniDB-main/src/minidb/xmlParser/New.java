package minidb.xmlParser;

public class New extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        registry.createNewDatabase(cmdArgs[1]);
    }
}
