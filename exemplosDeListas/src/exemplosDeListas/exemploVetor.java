package exemplosDeListas;

public class exemploVetor {
	public static void main(String[] args) {
		
		// criando o vetor
		int[] numeros = new int[5];
		
		// atribuindo o valor a cada casa
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		// return 2
		System.out.println(numeros[2]);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		int[][] numeros2 = new int[3][3];
		
		for(int h = 0; h < numeros2.length; h++) {
			for(int j = 0; j < numeros2.length; j++) {
				numeros2[h][j] = 0;
			}
		}
		
		numeros2[1][2] = 1;
		
		for(int h = 0; h < numeros2.length; h++) {
			for(int j = 0; j < numeros2.length; j++) {
				System.out.print(numeros2[h][j] + " ");
			}
			System.out.println("");
		}
		
		
	}
}
