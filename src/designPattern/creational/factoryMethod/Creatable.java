package designPattern.creational.factoryMethod;

public interface Creatable<E extends Animal> {
    E create(AnimalType animalType,String[] args);
}
