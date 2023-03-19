package org.example.abstract_factory_1.factory;

public class AbstractGUIFactory {

	public static OSFactory createComponentsFactory(String osType) {
		if(osType.equalsIgnoreCase("Win")) {
			return new WinFactory();
		}
		else if(osType.equalsIgnoreCase("Mac")) {
			return new MacFactory();
		}
		else {
			return null;
		}
	}
}
