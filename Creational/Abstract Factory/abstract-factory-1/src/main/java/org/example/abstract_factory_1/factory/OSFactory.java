package org.example.abstract_factory_1.factory;

import org.example.abstract_factory_1.pojos.Button;
import org.example.abstract_factory_1.pojos.Prompt;

public interface OSFactory {
	Button createButton();
	Prompt createPrompt();
}
