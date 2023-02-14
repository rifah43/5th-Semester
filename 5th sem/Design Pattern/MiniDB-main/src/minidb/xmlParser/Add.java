package minidb.xmlParser;

import constants.Errors;

public class Add extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        if (!isDBNull(CurrentDb)) {
            CurrentDb.addData(cmdArgs[1]);
        } else {
            Errors.noDatabaseSelected();
        }
    }
}
