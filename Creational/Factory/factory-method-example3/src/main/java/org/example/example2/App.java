package org.example.example2;

import org.example.example2.factory.ButtonFactory;
import org.example.example2.pojos.Button;

public class App {
	public static void main(String[] args) {
		try {
			Button b1 = ButtonFactory.getInstance("win");
			b1.click();

			Button b2 = ButtonFactory.getInstance("mac");
			b2.click();

			Button b3 = ButtonFactory.getInstance("unix");
			b3.click();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
