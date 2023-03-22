package org.example.strategy_pattern1.duck.strategy.quack;

public interface ISimpleQuackStrategy extends IQuackStrategy{

	@Override
	public default void quack() {
		System.out.println("quack quack...");
	}

}
