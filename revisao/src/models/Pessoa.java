package models;

public class Pessoa extends Animais implements SuperPoderes {

	@Override
	public String poder() {
		return "Estou voando!!!";
	}	
}
