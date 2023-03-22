package org.example.strategy_pattern1;

import org.example.strategy_pattern1.duck.Duck;
import org.example.strategy_pattern1.duck.MountainDuck;
import org.example.strategy_pattern1.duck.PlasticDuck;

public class Client 
{
    public static void main( String[] args )
    {
        Duck d1=new PlasticDuck();
        d1.quack();
        d1.fly();
        
        MountainDuck d2=new MountainDuck();
        d2.quack();
        d2.fly();
        
        
    }
}
