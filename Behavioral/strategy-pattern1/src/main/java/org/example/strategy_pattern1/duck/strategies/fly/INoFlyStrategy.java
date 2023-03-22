package org.example.strategy_pattern1.duck.strategies.fly;

public interface INoFlyStrategy extends IFlyStrategy{

	@Override
	public default void fly() {
		System.out.println("Can not fly.");
	}

}
