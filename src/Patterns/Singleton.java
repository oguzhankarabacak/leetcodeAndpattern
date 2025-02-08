package Patterns;

class DatabaseManager {
    private static DatabaseManager instance;

    private DatabaseManager(){
        //Create database collection
    }
    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {

    }
}