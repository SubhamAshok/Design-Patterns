package org.example.factory_method_example2.factory;

import java.util.HashMap;
import java.util.Map;

import org.example.factory_method_example2.pojos.Animal;
import org.example.factory_method_example2.pojos.Cat;
import org.example.factory_method_example2.pojos.Dog;

public class BalancedAnimalFactory implements AnimalFactory{

	//state defines whether object is created for that animal
	Map<Animal,Boolean> stateMap=new HashMap<Animal, Boolean>();
	public BalancedAnimalFactory() {
		stateMap.put(new Dog(), false);
		stateMap.put(new Cat(), false);
	}
	@Override
	public Animal getAnimal() {
		for(Animal animal:stateMap.keySet()) {
			if(!stateMap.get(animal)) {
				stateMap.put(animal, true);
				return animal;
			}
		}
		return null;
	}
	
}
