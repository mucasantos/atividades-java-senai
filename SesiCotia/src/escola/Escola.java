package escola;

import java.util.Scanner;

import models.GestaoEstudante;
import models.HandleMenu;

public class Escola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		GestaoEstudante gs = new GestaoEstudante();
		
		HandleMenu menu = new HandleMenu(gs);

		do {
			menu.showMenu();
			menu.processUserInput(sc.nextInt());
		} while (true);
	}

}
