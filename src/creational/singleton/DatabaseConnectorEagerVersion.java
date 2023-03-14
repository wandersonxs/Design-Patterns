package creational.singleton;

public class DatabaseConnectorEagerVersion {

    // Eager Version
    public static DatabaseConnectorEagerVersion INSTANCE = new DatabaseConnectorEagerVersion();

    // Can safe "Reflexion Attack" and
    // has more than one instance
    private DatabaseConnectorEagerVersion(){

    }

    public void connect(){
        System.out.println("Connecting to the database - EAGER VERSION");
    }

    public void disconnect(){
        System.out.println("Disconnecting to the database - EAGER VERSION");
    }

}
