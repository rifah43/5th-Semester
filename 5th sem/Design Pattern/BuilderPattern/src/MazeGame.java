public class MazeGame {
    public static Maze makeMaze() {
        return new Maze();
    }

    public static Room makeRoom(int n) {
        return new Room(n);
    }

    public static Wall makeWall() {
        return new Wall();
    }

    public static Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    public Maze createMaze(MazeBuilder builder) {
        Maze maze = makeMaze();
        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door door = makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide("NORTH", makeWall());
        room1.setSide("EAST", door);
        room1.setSide("SOUTH", makeWall());
        room1.setSide("WEST", makeWall());

        room2.setSide("NORTH", makeWall());
        room2.setSide("EAST", makeWall());
        room2.setSide("SOUTH", makeWall());
        room2.setSide("WEST", door);

        return maze;
    }
}

