package br.com.atividade;

import br.com.operadores.Calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacaoCachorro {

	String input;

//	String inNome;
//	String inIdade;
//	String inAltura;

	String auxNome;
	int countCharAux = 0;
	int maxIdadeAux = 0;
	double maxAlturaAux = 0;
	double somaAltura;
	int countAltura = 0;

	Calculadora calc = new Calculadora();

	Scanner scan = new Scanner(System.in);
	List<DadosCachorro> listaCachorro = new ArrayList<DadosCachorro>();

	public void insereCachorro() {

		do {
			DadosCachorro cachorro = new DadosCachorro(null, 0, 0);
			System.out.println("Digite o nome do cachorro: (Digite 'SAIR' para encerrar)");
			input = scan.next();

			if (!input.equalsIgnoreCase("SAIR")) {
				cachorro.setNome(input);

				System.out.println("Digite a idade do cachorro: (Digite 'SAIR' para encerrar)");
				input = scan.next();
				if (!input.equalsIgnoreCase("SAIR")) {
					cachorro.setIdade(Integer.parseInt(input));

					System.out.println("Digite a altura do cachorro: (Digite 'SAIR' para encerrar)");
					input = scan.next();
					if (!input.equalsIgnoreCase("SAIR")) {
						cachorro.setAltura(Double.parseDouble(input));
					}
				}
			}

			listaCachorro.add(cachorro);

		} while (!input.equalsIgnoreCase("SAIR"));

		if (listaCachorro != null) {

			// Imprime a lista
			for (DadosCachorro dog : listaCachorro) {
				System.out.println(dog.toString());
			}

			// Qtde caracteres no nome
			for (DadosCachorro dog : listaCachorro) {
				int countChar = dog.getNome().length();

				if (countChar > countCharAux) {
					countCharAux = countChar;
					auxNome = dog.getNome();
				}
			}

			System.out.println("\n");
			System.out.println("Cachorro com o maior nome: " + auxNome + ". Caracteres: " + countCharAux);

			// Maior idade
			for (DadosCachorro dog : listaCachorro) {
				int maxIdade = dog.getIdade();

				if (maxIdade > maxIdadeAux) {
					maxIdadeAux = maxIdade;
					auxNome = dog.getNome();
				}

			}

			System.out.println("\n");
			System.out.println("Cachorro com maior idade: " + auxNome + ". Idade: " + maxIdadeAux);

			// Maior altura
			for (DadosCachorro dog : listaCachorro) {
				double maxAltura = dog.getAltura();

				if (maxAltura > maxAlturaAux) {
					maxAlturaAux = maxAltura;
					auxNome = dog.getNome();
				}
			}

			System.out.println("\n");
			System.out.println("Cachorro com maior altura: " + auxNome + ". Altura: " + maxAlturaAux);

			// Idade impar
			System.out.println("\n");
			System.out.println("Cachorros com idade impar:");
			for (DadosCachorro dog : listaCachorro) {
				if (!calc.isPar(dog.getIdade())) {
					System.out.println(dog.getNome() + ", " + dog.getIdade());
				}
			}

			// Media das alturas
			for (DadosCachorro dog : listaCachorro) {
				somaAltura += dog.getAltura();
				countAltura++;
			}
			double mediaAltura = (somaAltura / countAltura);

			System.out.println("\n");
			System.out.println("Média das alturas: " + mediaAltura);

		} else {
			System.out.println("Lista vazia");
		}

	}

}
