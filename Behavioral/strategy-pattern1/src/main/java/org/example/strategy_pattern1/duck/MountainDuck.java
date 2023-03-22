package org.example.strategy_pattern1.duck;

import org.example.strategy_pattern1.duck.strategies.fly.IHighFlyStrategy;
import org.example.strategy_pattern1.duck.strategy.quack.ISimpleQuackStrategy;

public class MountainDuck extends Duck implements IHighFlyStrategy, ISimpleQuackStrategy{

}
