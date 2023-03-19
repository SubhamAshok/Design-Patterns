package org.example.abstract_factory_1;

import java.util.Scanner;

import org.example.abstract_factory_1.factory.AbstractGUIFactory;
import org.example.abstract_factory_1.factory.OSFactory;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Abstract factory, is a set of factory methods.
		 * It provides a interface for creating families of related or dependent objects, without specifying their concrete classes
		 * difference from factory methods: factory method creates single object, this creates multiples
		*/
    	Scanner sc=new Scanner(System.in);
    	String osType=sc.nextLine();
		OSFactory of= AbstractGUIFactory.createComponentsFactory(osType);
		of.createButton().click();
		of.createPrompt().showMessage();
    }
}
