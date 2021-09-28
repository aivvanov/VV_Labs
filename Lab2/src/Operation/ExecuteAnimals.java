package Operation;

import Assets.Animals.*;

public class ExecuteAnimals {
    public void PerformProcess() {
        Animal[] animals = { new Dog( "dog food", "a booth", "doberman"), new Cat("cat food", "a tree", "green"), new Horse("horse food", "a paddock", true) };

        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
            System.out.println();
        }
    }
}
