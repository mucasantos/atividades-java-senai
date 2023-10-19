package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo4Write {

	public static void main(String[] args) {
		
		String filePath = "C:\\temp\\escrita.txt";
		String[] nomes = new String[] { "Samuel", "Victor", "Giovanna", "Douglas", "Pedro" };

		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(filePath, true))) {

			for (String line : nomes) {
				buffer.write(line);
				buffer.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// Função para String (split)
		String test = "Samuel,98174-1010,22/09/1977,Rua Legal - 99";
		String[] dados = test.split(",");
		for (int index = 0; index < dados.length; index++) {
			System.out.println(dados[index]);
		}
	}
}

/* Criar uma classe chamada User
 * nome
 * telefone
 * mesNasc
 * End
 * */
 