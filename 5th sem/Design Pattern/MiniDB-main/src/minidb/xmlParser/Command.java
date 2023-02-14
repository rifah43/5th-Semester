package minidb.xmlParser;

public abstract class Command {
    public abstract void executeCommand(DatabaseFile CurrentDb, RegistryFile registry, String[] cmdArgs);
    protected void print(String x) {
        System.out.println(x);
    }
    public static boolean isDBNull(DatabaseFile CurrentDb){
        if (CurrentDb != null) {
            return true;
        }
        return false;
    }
}
