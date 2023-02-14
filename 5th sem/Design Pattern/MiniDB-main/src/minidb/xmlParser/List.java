package minidb.xmlParser;

public class List extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        registry.listAllDatabases();
    }
}
