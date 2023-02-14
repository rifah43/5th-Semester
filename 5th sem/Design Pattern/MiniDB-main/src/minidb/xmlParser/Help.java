package minidb.xmlParser;

import constants.Constants;

public class Help extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        print(Constants.HELP_COMMANDS);
    }
}
