package org.example.strategy_pattern1.duck.strategies.fly;

public class FlyWithWingsStrategy implements IFlyStrategy{

	@Override
	public void fly() {
		System.out.println("I am flying.");
	}
}
