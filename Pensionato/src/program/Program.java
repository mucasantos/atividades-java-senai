package program;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Classe Rent => quantidade de quartos
		Rent[] allRooms = new Rent[10];

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados?");
		int qtdRooms = sc.nextInt();

		for (int i = 1; i <= qtdRooms; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("Nome:");
			//Para limpar o buffer e pegar nomes com espaço
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("RG:");
			String rg = sc.nextLine();
			System.out.print("Quarto:");
			int room = sc.nextInt();

			allRooms[room] = new Rent(name, email, rg);
			
			System.out.println(allRooms[room]);

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
