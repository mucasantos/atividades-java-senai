package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		/*
		 * Trabalhar com arquivos e pastas utilizando Java
		 */
		File file = new File("C:\\temp\\exemplo1.txt");
		// Reserva um espaço em memória para o scanner
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				System.out.println(sc.hasNextLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Eu passei aqui...");
			if (sc != null) {
				sc.close();
				System.out.println("Fechei...");
			}
		}
	}

}
