package creational.singleton;

import creational.singleton.DatabaseConnectorEagerVersion;
import creational.singleton.DatabaseConnectorLazyVersion;
import creational.singleton.DatabaseConnectorThreadSafeEnum;
import creational.singleton.DatabaseConnectorThreadSafeSync;

public class Main {
    public static void main(String[] args) {

        // Eager Version
        DatabaseConnectorEagerVersion eagerVersion = DatabaseConnectorEagerVersion.INSTANCE;
        eagerVersion.connect();
        eagerVersion.disconnect();

        DatabaseConnectorLazyVersion lazyVersion = DatabaseConnectorLazyVersion.getInstance();
        lazyVersion.connect();
        lazyVersion.disconnect();

        DatabaseConnectorThreadSafeSync threadSafeSyncVersion = DatabaseConnectorThreadSafeSync.getInstance();
        threadSafeSyncVersion.connect();
        threadSafeSyncVersion.disconnect();

        DatabaseConnectorThreadSafeEnum threadSafeEnumVersion = DatabaseConnectorThreadSafeEnum.INSTANCE;
        threadSafeEnumVersion.connect();
        threadSafeEnumVersion.disconnect();

        DatabaseConnectorThreadSafeEnum threadSafeEnumVersion2 = DatabaseConnectorThreadSafeEnum.INSTANCE;
        threadSafeEnumVersion.connect();
        threadSafeEnumVersion.disconnect();

        if (threadSafeEnumVersion == threadSafeEnumVersion2){
            System.out.println("Objects are the same");
        }

    }
}