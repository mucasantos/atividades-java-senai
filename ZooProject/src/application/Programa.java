package application;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal cavalinho = new Cavalo();

		cavalinho.emiteSom();

		Veterinario.examinar(cavalinho);

		// Array de tam fixo

		Jaula[] jaulas = new Jaula[10];

		System.out.println("Digite o nome do animal para inserir na jaula");
		// input

		for (int index = 0; index < 10; index++) {
			String nomeDoBicho = JOptionPane.showInputDialog("Qual animal vc quer criar?");

			if(nomeDoBicho == null) {
				continue;
			}
			
			switch (nomeDoBicho) {
			case "Cavalo":
				Animal cachorro = new Cavalo();
				cachorro.setNome("bob");
				jaulas[index].setAnimal(cachorro);
				break;
			default:
				System.out.println("Não sei...");
				break;

			}

		}
		
		

		// Switch - case (Cachorro/Gato)

		// Mostrar os animais na jaula
		
		

	}

}