package org.example.strategy_pattern1.duck;

import org.example.strategy_pattern1.duck.strategies.fly.INoFlyStrategy;
import org.example.strategy_pattern1.duck.strategy.quack.INoQuackStrategy;

public class PlasticDuck extends Duck implements INoFlyStrategy, INoQuackStrategy{
	
}
