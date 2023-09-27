package basic;

public class Triangulo {

	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double area() {
		double p = (ladoA + ladoB + ladoC) / 2;
		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
	}
	
	public void somarLados()
	{
		System.out.println( ladoA + ladoB + ladoC);
	}
}
