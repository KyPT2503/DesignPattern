package designPattern.creational.objectPool;

public class Taxi {
    private String name;

    public Taxi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                '}';
    }
}
