package designPattern.creational.factoryMethod;

public class Dog extends Animal {
    private String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }


    public Dog withName(String name) {
        this.setName(name);
        return this;
    }

    public Dog withSize(String size) {
        this.setSize(size);
        return this;
    }

    public Dog withBread(String bread) {
        this.breed = bread;
        return this;
    }

    public Dog(String name, String size, String breed) {
        super(name, size);
        this.breed = breed;
    }

    @Override
    public void loudOut() {
        System.out.println(this.getName()+" Gaw Gaw");
    }
}
