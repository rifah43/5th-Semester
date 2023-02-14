package minidb.xmlParser;

import constants.Errors;

public class Schema extends Command{
    @Override
    public void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs) {
        if (!isDBNull(CurrentDb)) {
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
            Errors.noDatabaseSelected();
        }
    }
}
