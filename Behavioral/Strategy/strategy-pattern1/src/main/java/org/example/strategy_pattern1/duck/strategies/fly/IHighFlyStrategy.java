package org.example.strategy_pattern1.duck.strategies.fly;

public interface IHighFlyStrategy extends IFlyStrategy{

	@Override
	public default void fly() {
		System.out.println("Can fly.");
	}
}
