package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Tipos exp
 * ArrayIndexOutOfBoundsException
 * InputMismatchException
 * 
 * */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite nomes, separados por espaço");

		// tente
		try {
			String[] names = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(names[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Digite um index válido => entre 0 e qtd-1");

		} catch (InputMismatchException e) {
			System.out.println("Digite um número e não letras...");
		}
		System.out.println("Ufa...Acabou!!");

		sc.close();
	}

}
