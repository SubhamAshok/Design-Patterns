package org.example.strategy_pattern1.duck;

import org.example.strategy_pattern1.duck.strategies.fly.IFlyStrategy;
import org.example.strategy_pattern1.duck.strategy.quack.IQuackStrategy;

public abstract class Duck{

	IFlyStrategy flyStrategy;
	IQuackStrategy quackStrategy;

	public Duck(IFlyStrategy flyStrategy, IQuackStrategy quackStrategy) {
		this.flyStrategy = flyStrategy;
		this.quackStrategy = quackStrategy;
	}
	
	public void fly() {
		this.flyStrategy.fly();
	}
	public void quack() {
		this.quackStrategy.quack();
	}
}
