package br.com.senaisp.bauru.nicolas.lição03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base do "
				+ "triangulo:");
		float base = sc.nextFloat();
		System.out.println("Digite a altura do triangulo:");
		float altura = sc.nextFloat();
		//Calculando a área do triangulo
		float area = base + altura / 2;
		//mostrando a área
		System.out.println("A área do triangulo é " +area);
		sc.close();
	}

}
