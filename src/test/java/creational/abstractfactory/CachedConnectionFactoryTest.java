package creational.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CachedConnectionFactoryTest {

    private CachedConnectionFactory cachedConnectionFactory
            = new CachedConnectionFactory();

    @Test
    public void createConnection_connection_caches() {

        // given
        Connection connection = cachedConnectionFactory.createConnection("foo");

        // when
        Connection cachedConnection = cachedConnectionFactory.createConnection("foo");

        // then
        assertTrue(connection.equals(cachedConnection));
    }


    @Test
    public void createConnection_cache_invalidates() {

        // given
        Connection connection = cachedConnectionFactory.createConnection("foo");

        // when
        Connection newConnection = cachedConnectionFactory.createConnection("bar");

        // then
        assertFalse(connection.equals(newConnection));
    }

    @Test
    public void createConnection_persists_with_different_factory_instance() {

        // given
        Connection connection = cachedConnectionFactory.createConnection("foo");

        // when
        cachedConnectionFactory = new CachedConnectionFactory();

        // and
        Connection cachedConnection = cachedConnectionFactory.createConnection("foo");

        // then
        assertTrue(connection.equals(cachedConnection));
    }

    @Test
    public void createConnection_creates_connection_with_name() {

        // given
        Connection connection  = cachedConnectionFactory.createConnection("foobar");

        // then
        assertTrue("foobar".equals(connection.getName()));
    }
}
