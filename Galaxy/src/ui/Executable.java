package ui;

import model.Controller;

public class Executable {

	private Controller control;

	public static void main(String[] args) {

		Executable exe = new Executable();
		exe.showMainMenu();

	}

	public Executable() {

		control = new Controller();

	}

	public void showMainMenu() {

		System.out.println("Welcome to Galaxy!");

	}

}
