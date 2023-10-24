package models;

import java.util.HashMap;

public class Estudante extends Pessoa {
	private HashMap<String, String> notas = new HashMap<String, String>();

	public HashMap<String, String> getNotas() {
		return notas;
	}

	public void setNotas(HashMap<String, String> notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		HashMap<String, String> notas = getNotas();
		
		// soma vai ser a soma das notas da aluna
		int soma = 0;
		// count contar a quantidade de materias
		int count = 0;
		
		for(String notaStr : notas.values()) {
			if (notaStr != null) {
				int nota = Integer.parseInt(notaStr);
				// soma = soma + nota
				soma += nota;
				count++;
			}
		}
		
		return (count > 0) ? (double) soma / count : 0;
	}
	
	
}


