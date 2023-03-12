package org.example.factory_method_example2;

import org.example.factory_method_example2.factory.AnimalFactory;
import org.example.factory_method_example2.factory.BalancedAnimalFactory;
import org.example.factory_method_example2.factory.RandomAnimalFactory;
import org.example.factory_method_example2.pojos.Animal;

public class App {
	public static void main(String[] args) {

		AnimalFactory randomAnimalFactory = new RandomAnimalFactory();
		Animal animal4 = randomAnimalFactory.getAnimal();
		animal4.speak();

		Animal animal5 = randomAnimalFactory.getAnimal();
		animal5.speak();

		Animal animal6 = randomAnimalFactory.getAnimal();
		animal6.speak();

		AnimalFactory balancedAnimalFactory = new BalancedAnimalFactory();
		Animal animal1 = balancedAnimalFactory.getAnimal();
		animal1.speak();

		Animal animal2 = balancedAnimalFactory.getAnimal();
		animal2.speak();

		Animal animal3 = balancedAnimalFactory.getAnimal();
		animal3.speak();// should throw a NullPointerException
	}
}
