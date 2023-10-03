package program;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rent[] allRooms = new Rent[10];

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serão alugados?");
		int qtdRooms = sc.nextInt();

		for (int i = 1; i <= qtdRooms; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("Nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Quarto:");
			int room = sc.nextInt();

			allRooms[room] = new Rent(name, email);
		}
		System.out.println();

		for (int i = 0; i < allRooms.length; i++) {
			if (allRooms[i] == null) {
				System.out.println(i + ": VAZIO");
			} else {
				System.out.println(i + ":" + allRooms[i]);
			}
		}

		sc.close();

	}

}
