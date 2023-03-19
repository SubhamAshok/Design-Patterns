package org.example.example2.factory;

import org.example.example2.pojos.Button;
import org.example.example2.pojos.MacButton;
import org.example.example2.pojos.WinButton;

public class ButtonFactory {

	public static Button getInstance(String type) {
		switch (type.toLowerCase()) {
		case "win":
			return new WinButton();
		case "mac":
			return new MacButton();
		default:
			throw new IllegalArgumentException("This button does not exist...");
		}
	}
}
