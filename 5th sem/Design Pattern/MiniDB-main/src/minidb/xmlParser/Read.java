package minidb.xmlParser;

import constants.Errors;

public class Read extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        if (!isDBNull(CurrentDb)) {
            if (cmdArgs.length == 1) {
                CurrentDb.readData();
            } else {
                CurrentDb.readData(cmdArgs[1]);
            }
        } else {
            Errors.noDatabaseSelected();
        }
    }
}
