package br.com.senaisp.bauru.nicolas.lição01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		// TODO Auto-generated method stub
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		//Solicitar a entrada via teclado pelo usuário
		System.out.println("Digite a quantidade de galões:");
		galoes = scn.nextDouble();
		scn.close();
		// Fazendo as contas 
		litros = galoes * gal2lt;
		//mostrar resultado
		System.out.println(galoes + " galões equivalem a " + litros + "litros");
	}

}
