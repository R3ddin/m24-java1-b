package br.com.senaisp.bauru.nicolas.lição03;

public class Exemplo01 {
	public static int _idade = 17;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte vByte = 127;
		vByte++; //aqui ocorre o estouro do limite do byte
		System.out.println(vByte); //mostra o limite inferior
		float vFloat = 6_000.00f; //preciso colocar f para dizer que é float
		if (vByte == -128) {
			String nome = "Nicolas";
			System.out.println("Meu nome é" + nome );
		}
		//Aqui não existe variavel nome
		//System.out.println(nome);
		//Alterando a variavel
		_idade = 20;
		System.out.println(_idade);
		//Apartir dessa ponto passa a usar variavel local
		int idade = 17;
		System.out.println(idade);
		idade += 10; //somando idade com 10
		System.out.println(idade);
	}

}
