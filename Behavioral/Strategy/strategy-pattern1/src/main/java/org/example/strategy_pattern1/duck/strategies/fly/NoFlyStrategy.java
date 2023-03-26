package org.example.strategy_pattern1.duck.strategies.fly;

public class NoFlyStrategy implements IFlyStrategy{

	@Override
	public void fly() {
		System.out.println("I can not fly.");
	}

}
