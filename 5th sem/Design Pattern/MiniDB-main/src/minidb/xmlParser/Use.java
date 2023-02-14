package minidb.xmlParser;

public class Use extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        String path = registry.getDatabasePath(cmdArgs[1], false);

        if (path != null) {
            CurrentDb = new DatabaseFile(path);
            CurrentDb.EditMode();
            print("Successfully loaded Database named: " + cmdArgs[1]);
        } else {
            print("Database not found");
        }
    }
}
