package basic;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		 
		Produto produto = new Produto();
		
		System.out.println("Digite o nome do produto:");
		produto.name = sc.next();
		
		System.out.println("Digite o valor do produto:");
		produto.price = sc.nextDouble();
		
		System.out.println("Digite a quantidade de produtos:");
		produto.quantity = sc.nextInt();
		
				
	
		
		sc.close();
		
		/*
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os lados do Triangulo X");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
				
		System.out.println("Digite os lados do Triangulo Y");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
				
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX); 
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		System.out.println("Soma dos lados");
		x.somarLados();

						
		if(areaX > areaY) {
			System.out.println("A area do Triangulo X é maior");
		}else if (areaY > areaX) {
			System.out.println("A area do Triangulo Y é maior");
		} else {
			System.out.println("As areas sao iguais...");
		}
		
		sc.close();
*/
	}

}
