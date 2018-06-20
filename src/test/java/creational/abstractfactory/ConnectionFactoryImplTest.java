package creational.abstractfactory;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConnectionFactoryImplTest {

    private ConnectionFactoryImpl connectionFactory = new ConnectionFactoryImpl();

    @Test
    public void createConnection_creates_unique_connections() {

        // given
        Connection connection = connectionFactory.createConnection("foo");

        // when
        Connection otherConnection = connectionFactory.createConnection("bar");

        // then
        assertFalse(connection.equals(otherConnection));
    }

    @Test
    public void createConnection_creates_connection_with_name() {

        // given
        Connection connection  = connectionFactory.createConnection("foobar");

        // then
        assertTrue("foobar".equals(connection.getName()));
    }
}
