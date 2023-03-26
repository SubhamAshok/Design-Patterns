package org.example.strategy_pattern1.duck.strategy.quack;

public class NoQuackStrategy implements IQuackStrategy{

	@Override
	public void quack() {
		System.out.println("can't quack...");
	}

}
