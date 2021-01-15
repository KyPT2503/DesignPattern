package designPattern.creational.factoryMethod;

public class Cat extends Animal {
    private String gender;

    public Cat() {
    }

    public Cat(String gender) {
        this.gender = gender;
    }

    public Cat(String name, String size, String gender) {
        super(name, size);
        this.gender = gender;
    }

    public Cat withName(String name) {
        this.setName(name);
        return this;
    }

    public Cat withSize(String size) {
        this.setSize(size);
        return this;
    }

    public Cat withGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public void loudOut() {
        System.out.println(this.getName() + " Meow meow");
    }
}
