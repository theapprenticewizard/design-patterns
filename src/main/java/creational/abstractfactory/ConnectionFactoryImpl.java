package creational.abstractfactory;

public class ConnectionFactoryImpl implements AbstractConnectionFactory {

    /**
     * Creates a new instance of a connection.
     *
     * @param connectionName
     * @return
     */
    public Connection createConnection(String connectionName) {
        return new Connection(connectionName);
    }
}