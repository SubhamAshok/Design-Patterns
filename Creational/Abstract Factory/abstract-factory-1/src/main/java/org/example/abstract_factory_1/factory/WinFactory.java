package org.example.abstract_factory_1.factory;

import org.example.abstract_factory_1.pojos.Button;
import org.example.abstract_factory_1.pojos.Prompt;
import org.example.abstract_factory_1.pojos.WinButton;
import org.example.abstract_factory_1.pojos.WinPromt;

public class WinFactory implements OSFactory{

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Prompt createPrompt() {
		return new WinPromt();
	}

}
