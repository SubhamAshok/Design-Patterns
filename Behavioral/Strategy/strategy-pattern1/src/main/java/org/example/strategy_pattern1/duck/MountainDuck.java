package org.example.strategy_pattern1.duck;

import org.example.strategy_pattern1.duck.strategies.fly.IFlyStrategy;
import org.example.strategy_pattern1.duck.strategy.quack.IQuackStrategy;

public class MountainDuck extends Duck{

	public MountainDuck(IFlyStrategy flyStrategy, IQuackStrategy quackStrategy) {
		super(flyStrategy, quackStrategy);
	}

}
