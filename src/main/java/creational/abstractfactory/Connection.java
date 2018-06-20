package creational.abstractfactory;

public class Connection {

    private final String name;

    public Connection(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
