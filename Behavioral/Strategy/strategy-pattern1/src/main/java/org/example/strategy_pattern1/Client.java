package org.example.strategy_pattern1;

import org.example.strategy_pattern1.duck.BabyDuck;
import org.example.strategy_pattern1.duck.Duck;
import org.example.strategy_pattern1.duck.MountainDuck;
import org.example.strategy_pattern1.duck.ToyDuck;
import org.example.strategy_pattern1.duck.strategies.fly.FlyWithWingsStrategy;
import org.example.strategy_pattern1.duck.strategies.fly.IFlyStrategy;
import org.example.strategy_pattern1.duck.strategies.fly.NoFlyStrategy;
import org.example.strategy_pattern1.duck.strategy.quack.IQuackStrategy;
import org.example.strategy_pattern1.duck.strategy.quack.NoQuackStrategy;
import org.example.strategy_pattern1.duck.strategy.quack.SimpleQuackStrategy;

public class Client {
	public static void main(String[] args) {
		IFlyStrategy flyBehavior = new FlyWithWingsStrategy();
		IFlyStrategy noFlyBehavior = new NoFlyStrategy();
		IQuackStrategy quackBehavior = new SimpleQuackStrategy();
		IQuackStrategy noQuackBehavior = new NoQuackStrategy();

		Duck mountainDuck = new MountainDuck(flyBehavior, quackBehavior);
		mountainDuck.quack();
		mountainDuck.fly();

		Duck toyDuck = new ToyDuck(noFlyBehavior, noQuackBehavior);
		toyDuck.quack();
		toyDuck.fly();

		Duck babyDuck = new BabyDuck(noFlyBehavior, quackBehavior);
		babyDuck.quack();
		babyDuck.fly();

	}
}
