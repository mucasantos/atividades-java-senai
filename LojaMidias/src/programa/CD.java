package programa;

import java.util.Scanner;

public class CD extends Midia {
	private int nMusicas;

	// Construtor sem parâmetros.
	public CD() {

	}
	// Construtor com parâmetros.
	public CD(int codigo, double preco, String name, int nMusicas) {
		// Chamada ao construtor da classe Midia.
		super(codigo, preco, name);
		setMusica(nMusicas);
	}

	// Função para impressao do tipo.
	public String getTipo() {
		return "CD: ";
	}

// Função que retorna o conteúdo do campos desta
	// classe e da classe Midia (usando super !).
	public String getDetalhes() {
		return super.getDetalhes() + "\n" + "Numero de musicas: " + nMusicas + "\n";
	}

	public void setMusica(int nmus) {
		nMusicas = (nmus > 0) ? nmus : 0;
	}

	// Função para leitura dos dados via teclado dos
	// campos desta classe e dos campos da classe
	// Midia (usando super !).
	public void inserirDados() {

		super.inserirDados();

		Scanner in = new Scanner(System.in);
		// Leitura dos dados do teclado.
		System.out.printf("\n Entre com o numero de musicas: ");
		int nmus = in.nextInt();
		// Enviando os dados lidos para as funcoes set.
		setMusica(nmus);
		
		in.close();

	}
}
