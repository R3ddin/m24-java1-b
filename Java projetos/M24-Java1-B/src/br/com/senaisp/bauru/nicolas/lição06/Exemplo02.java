package br.com.senaisp.bauru.nicolas.lição06;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] cinema = new String [10] [10];
		// inicializando o cinema
		for(int i=0; i<cinema.length;i++) { //fileiras
			for (int j=0;j<cinema[i].length;j++) {
				cinema[i][j]= "-";
			}
		}
		//mostrando os ingressos
		String term = null;
		do {
			for(int i=0;i<cinema.length;i++) {
				System.out.println("FL " + (i<9 ? " ": "") +
						(i+1) + " ");
				for(int j=0;j<cinema[i].length;j++) {
					System.out.println(cinema[i] [j] + " ");
				}
			}
		} while(!term.equalsIgnoreCase("N"));
		sc.close();
	}

}
