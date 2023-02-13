package constants;

public class constants {

    public static String VERSION = "v0.3.1";

    static String ROOT_PATH = ".";
    public static String DATA_XML_PATH = ROOT_PATH + "\\minidb.xml";
    public static String DB_DIR_PATH = ROOT_PATH + "\\db";
   

    public static final String HELP_COMMANDS = "\n" +
    "Commands:\n" +
    "  exit;           - Exits the program\n" +
    "  help            - Prints this menu\n" +
    "  list            - Lists all the databases\n" +
    "  use <name>      - Select the database\n" +
    "  drop <name>     - Drops a database if it exists\n" +
    "  new <name>      - Create a new database\n" +
    "  schema <data>   - declare the schema for newly created database\n" +
    "  add <data>      - Inserts data (MUST FOLLOW SCHEMA)\n" +
    "  read ?<id>      - Shows the data in the database. id is optional\n" +
    "  delete <table>  - Deletes a row\n";
    public static void getHeading(){
        String HEADING = "\n\n" +
        "╔═══════════════════════════════════════════════════╗\n" +
        "║                 Welcome to MiniDB                 ║\n" +
        "║                      " + VERSION + "                       ║\n" + 
        "║              --- Made by Chanakya ---             ║\n" + 
        "║      Source: https://github.com/U-C-S/MiniDB      ║\n" +
        "╚═══════════════════════════════════════════════════╝\n" + 
        "Enter the Commands: (Use 'exit;' to exit the cli)";
        
        String CMD_PREFIX = "\n\u001B[31m>\u001B[0m ";
    }
    public static void getHeadingWithoutUTF8(){
         String HEADINGx = "\n\n" +
        "---------- Welcome to MiniDB ----------\n" +
        "---------------- " + VERSION + " ---------------\n" +
        "----------- Made by Chanakya ----------\n" +
        "Source: https://github.com/U-C-S/MiniDB\n\n" +
        "Enter the Commands: (Use 'exit;' to exit the cli)";

        String CMD_PREFIXx = "\n> ";
    }
}
