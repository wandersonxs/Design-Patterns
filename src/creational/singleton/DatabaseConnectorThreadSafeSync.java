package creational.singleton;

public class DatabaseConnectorThreadSafeSync {

    private static DatabaseConnectorThreadSafeSync INSTANCE;

    // Can safe "Reflexion Attack" and
    // has more than one instance
    private DatabaseConnectorThreadSafeSync() {

    }

    public static DatabaseConnectorThreadSafeSync getInstance(){
        if (INSTANCE == null) {
            //This block can enter by a single thread
            //PROBLEM: it is too slow (100x)
            synchronized (DatabaseConnectorThreadSafeSync.class) {
                INSTANCE = new DatabaseConnectorThreadSafeSync();
            }
        }
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database - THREAD SAFE SYNC VERSION");
    }

    public void disconnect() {

        System.out.println("Disconnecting to the database - THREAD SAFE SYNC VERSION");
    }

}
