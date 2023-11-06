package code;

import models.Pizzaria;

public class App {

	public static void main(String[] args) {
		
		Pizzaria pizzaria1 = new Pizzaria();
		Pizzaria pizzaria2 = new Pizzaria();
		
		System.out.println(pizzaria1);
		System.out.println(pizzaria2);
		
		System.out.println(pizzaria1.hashCode());
		System.out.println(pizzaria2.hashCode());
		
	}

}
