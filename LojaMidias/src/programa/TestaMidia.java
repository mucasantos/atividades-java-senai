package programa;

import java.util.Scanner;

public class TestaMidia {

	public static void main(String[] args) {

		// Cria um vetor de elementos que são objetos da classe Midia.
		Midia[] lista = new Midia[10];

		int opcao;

		for (int i = 0; i < 2; i++) {
			// Usuário escolhe se quer cadastrar CD ou DVD.
			System.out.printf("Digite 1 para CD e 2 para DVD");
			Scanner in = new Scanner(System.in);
			opcao = in.nextInt();

			if (1 == opcao) {
				lista[i] = new CD();
			} else {
				lista[i] = new DVD();
			}
			lista[i].inserirDados();
			in.close();

		}

		// Imprimindo o conteudo de cada elemento do vetor de acordo

		// classe a que ele pertence (isto e, usando polimorfismo).
		for (int i = 0; i < 2; i++)
			lista[i].printDados();

	}

}
