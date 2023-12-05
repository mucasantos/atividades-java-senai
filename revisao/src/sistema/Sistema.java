package sistema;

import models.Animais;
import models.Pessoa;

public class Sistema {
	public static void main(String[] args) {
		// Classe animal que herda de SeresVivos
		Animais animal = new Animais();
		// funcao viver da classe abstrata
		System.out.println(animal.viver());
		// instanciando objeto pessoa
		Pessoa p = new Pessoa();
		// funcao poder da interface SuperPoderes
		System.out.println(p.poder());
	}
}
