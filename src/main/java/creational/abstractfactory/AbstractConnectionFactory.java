package creational.abstractfactory;

public interface AbstractConnectionFactory {

    /**
     * Provides an interface to create new connection instances.
     *
     * @param connectionName
     * @return
     */
    Connection createConnection(String connectionName);
}
