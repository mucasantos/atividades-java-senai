package exemplosDeListas;

public class equalsString {
	public static void main(String args[]) {
		String a = new String("Bedutti");
		String b = new String("Bedutti");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		if(a == b) {
			System.out.println("Somente com o = é true!");
		} else if(a.equals(b)) {
			System.out.println("Os dois objetos sao iguais!");
		}
		
		// ficar minusculo
		if(a.equals(b.toLowerCase())) {
			
		// maiusculo
		} else if(a.equals(b.toUpperCase())) {
			
		}
	}
}
