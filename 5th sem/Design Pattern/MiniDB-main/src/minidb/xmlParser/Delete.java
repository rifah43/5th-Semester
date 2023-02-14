package minidb.xmlParser;

import constants.Errors;

public class Delete extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        if (!isDBNull(CurrentDb)) {
            CurrentDb.deleteData(cmdArgs[1]);
        } else {
            Errors.noDatabaseSelected();
        }
    }
}
