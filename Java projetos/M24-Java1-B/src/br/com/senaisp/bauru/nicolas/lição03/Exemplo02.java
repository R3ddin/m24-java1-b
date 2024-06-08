package br.com.senaisp.bauru.nicolas.lição03;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = a++; //a -> 11 a - a +1
		int c = ++a; //a -> 12
		System.out.println("a="+a);//12
		System.out.println("b="+b);//10
		System.out.println("c="+c);//12
		//nesse ponto a ta valendo 13
		double total = (double) ++a / 2;
		System.out.println(total);
		char letraA = 65; //'A';
		char letraB = 'B';
		System.out.println(++letraA);
		System.out.println("" + letraA + letraB);
	}

}
