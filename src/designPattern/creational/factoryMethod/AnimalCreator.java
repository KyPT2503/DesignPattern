package designPattern.creational.factoryMethod;

public class AnimalCreator implements Creatable<Animal> {
    @Override
    public Animal create(AnimalType animalType, String[] args) {
        if (animalType == AnimalType.DOG) {
            return new Dog().withBread(args[0]).withName(args[1]).withSize(args[2]);
        } else if (animalType == AnimalType.CAT) {
            return new Cat().withGender(args[0]).withName(args[1]).withSize(args[2]);
        }
        return null;
    }
}
