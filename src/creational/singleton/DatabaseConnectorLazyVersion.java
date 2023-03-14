package creational.singleton;

public class DatabaseConnectorLazyVersion {

    private static DatabaseConnectorLazyVersion INSTANCE;

    // Can safe "Reflexion Attack" and
    // has more than one instance
    private DatabaseConnectorLazyVersion() {

    }

    public static DatabaseConnectorLazyVersion getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnectorLazyVersion();
        }
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database - LAZY VERSION");
    }

    public void disconnect() {

        System.out.println("Disconnecting to the database - LAZY VERSION");
    }

}
