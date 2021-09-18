package br.com.operadores;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsereNumero {

	Scanner scan = new Scanner(System.in);

	String input;

	int numRandom = new Random().ints(1, 0, 100).findFirst().getAsInt();

	List<String> listInput = new ArrayList<String>();

	Calculadora calcAux = new Calculadora();

	public void insereNum() {

		do {
			System.out.println("Digite um número: (Digite 'SAIR' para encerrar)");
			input = scan.next();

			if (!input.equals("SAIR")) {
				listInput.add(input);
			}
		} while (!input.equals("SAIR"));
		
		System.out.println("\n");
		
		for (String in : listInput) {
			System.out.println(in);
		}

		for (String in : listInput) {
			int num = Integer.parseInt(in);
			
			System.out.println("\n");
			System.out.println("--Operações para o número " + num + "--");
			System.out.println("> Soma");
			System.out.print(num + " + " + numRandom + " = ");
			System.out.println(calcAux.somar(num, numRandom));
			System.out.println("> Subtrair");
			System.out.print(num + " - " + numRandom + " = ");
			System.out.println(calcAux.subtrair(num, numRandom));
			System.out.println("> Multiplicar");
			System.out.print(num + " * " + numRandom + " = ");
			System.out.println(calcAux.multiplicar(num, numRandom));
			System.out.println("> Dividir");
			System.out.print(num + " / " + numRandom + " = ");
			System.out.println(calcAux.dividir(num, numRandom));
			System.out.println("> Par");
			System.out.println(calcAux.isPar(num));
			System.out.println("> Igual");
			System.out.print(num + " = " + numRandom + "? ");
			System.out.println(calcAux.isIgual(num, numRandom));
			System.out.println("> Incrementar");
			System.out.println(calcAux.incrementar(num));
			System.out.println("> Decrementar");
			System.out.println(calcAux.decrementar(num));
			System.out.println("> Primo");
			System.out.println(calcAux.isPrimo(num));
			System.out.println("--x--Fim--x--");
	
		}
	}

}
