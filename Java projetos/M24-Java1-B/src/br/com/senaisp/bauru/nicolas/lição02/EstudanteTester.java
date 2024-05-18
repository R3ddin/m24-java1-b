package br.com.senaisp.bauru.nicolas.lição02;

public class EstudanteTester {

	public static void main(String[] args) {
		Estudante est01 = new Estudante();
		est01.setNome("Sarah");
		est01.setId(1);
		est01.setMedia(5.5f);
		//Mostrando valores
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento: "+est01.getDocumento());
		//Obtendo o objeto como representação textual
		System.out.println(est01.toString());
		//Criando um novo Estudante
		Estudante est02 = new Estudante(2, "Nicolas",
				"12345678900", 9.6f, 1600.00, true);
		//mostrando o estudante
		System.out.println(est02.toString());
	}

}
