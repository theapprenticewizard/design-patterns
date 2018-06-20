package creational.abstractfactory;

public class CachedConnectionFactory implements AbstractConnectionFactory {

    private static Connection connection;


    /**
     * Creates a cached connection.  Invalidated cache if there is a new name.
     *
     * @param connectionName
     * @return
     */
    public Connection createConnection(String connectionName) {

        if (connection == null)
            connection = new Connection(connectionName);

        else if (!connectionName.equals(connection.getName()))
            connection = new Connection(connectionName);

        return connection;
    }
}
