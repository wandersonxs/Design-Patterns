package creational.singleton;

/*
    This is the best solution for the creational pattern - Singleton
    Enum is compile time constants, it is going to be guaranteed that
    this instance is thread safe by default.
 */
public enum DatabaseConnectorThreadSafeEnum {

    INSTANCE;

    public void connect() {
        System.out.println("Connecting to the database - THREAD SAFE ENUM VERSION");
    }

    public void disconnect() {
        System.out.println("Disconnecting to the database - THREAD SAFE ENUM VERSION");
    }

}
