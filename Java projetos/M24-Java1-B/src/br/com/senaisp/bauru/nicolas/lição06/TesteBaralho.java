package br.com.senaisp.bauru.nicolas.lição06;

public class TesteBaralho {

	public static void main(String[] args) {
		Baralho ba = new Baralho();
		Carta ct = ba.sortearCarta();
		System.out.println(ct.toString());

	}

}
