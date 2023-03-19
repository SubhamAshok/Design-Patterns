package org.example.abstract_factory_1.factory;

import org.example.abstract_factory_1.pojos.Button;
import org.example.abstract_factory_1.pojos.MacButton;
import org.example.abstract_factory_1.pojos.MacPrompt;
import org.example.abstract_factory_1.pojos.Prompt;

public class MacFactory implements OSFactory{

	@Override
	public Button createButton() {
		return new MacButton();	
	}

	@Override
	public Prompt createPrompt() {
		return new MacPrompt();
	}

}
