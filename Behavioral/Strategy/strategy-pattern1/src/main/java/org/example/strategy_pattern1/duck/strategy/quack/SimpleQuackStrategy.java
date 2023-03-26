package org.example.strategy_pattern1.duck.strategy.quack;

public class SimpleQuackStrategy implements IQuackStrategy{

	@Override
	public void quack() {
		System.out.println("quack quack...");
	}

}
