package org.example.strategy_pattern1.duck.strategy.quack;

public interface INoQuackStrategy extends IQuackStrategy{

	@Override
	public default void quack() {
		System.out.println("can't quack...");
	}

}
