package br.com.senaisp.bauru.nicolas.lição04;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Strings
		String nome1 = "Nicolas";
		String nome2 = "Nicolas";
		//Solicitando nomes
		System.out.println("Digite seu nome");
		nome2= sc.next();
		//comparando endereços de memória quando é objeto
		if (nome1 == nome2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		//comparando o conteudo de objeto
		
	}

}
