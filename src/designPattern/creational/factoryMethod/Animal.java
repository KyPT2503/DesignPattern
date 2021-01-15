package designPattern.creational.factoryMethod;

public abstract class Animal {
    private String name;
    private String size;

    public Animal() {
    }

    public Animal(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public abstract void loudOut();
}
