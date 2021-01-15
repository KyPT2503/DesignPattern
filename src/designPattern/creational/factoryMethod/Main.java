package designPattern.creational.factoryMethod;

import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AnimalCreator animalCreator = new AnimalCreator();

        Animal[] animals = new Animal[2];
        animals[0] = animalCreator.create(AnimalType.DOG, getArgument(AnimalType.DOG));
        animals[1] = animalCreator.create(AnimalType.CAT, getArgument(AnimalType.CAT));
        for (Animal animal : animals) {
            animal.loudOut();
        }
    }

    private static String[] getArgument(AnimalType animalType) {
        if (animalType == AnimalType.DOG) {
            System.out.println("Type: name, size, breed");
            String name = scanner.nextLine();
            String size = scanner.nextLine();
            String bread = scanner.nextLine();
            return new String[]{name, size, bread};
        } else if (animalType == AnimalType.CAT) {
            System.out.println("Type: name, size, gender");
            String name = scanner.nextLine();
            String size = scanner.nextLine();
            String gender = scanner.nextLine();
            return new String[]{name, size, gender};
        }
        return null;
    }
}
