package org.example.factory_method_example2.factory;

import java.util.Random;

import org.example.factory_method_example2.pojos.Animal;
import org.example.factory_method_example2.pojos.Cat;
import org.example.factory_method_example2.pojos.Dog;

public class RandomAnimalFactory implements AnimalFactory{

	@Override
	public Animal getAnimal() {
		Random random=new Random();
		int randomInt=random.nextInt(100);
		if(randomInt<50) {
			return new Cat();
		}else {
			return new Dog();
		}
	}

	
}
