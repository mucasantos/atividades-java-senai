package atividade;

public class TesteIngressos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ingresso ingresso1 = new Ingresso();
		
		ingresso1.setNome("Samuel Santos");
		ingresso1.setPreco(225);
		ingresso1.setCPF("021789456221"); 
		
		System.out.println(ingresso1.toString());
	}

}
