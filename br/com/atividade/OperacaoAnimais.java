package br.com.atividade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OperacaoAnimais {

	List<CadastroAnimais> listaCachorro = new ArrayList<CadastroAnimais>();
	List<CadastroAnimais> listaCavalo = new ArrayList<CadastroAnimais>();

	HashMap<String, String> dietaCachorro = new HashMap<String, String>();
	HashMap<String, String> porteCavalo = new HashMap<String, String>();
	


	
	HashMap<HashMap, List<CadastroAnimais>> animais = new HashMap<HashMap, List<CadastroAnimais>>();
	
//	animais.put("Cachorro", listaCachorro);
//	animais.put("Cavalo", listaCavalo);

	static Scanner scan = new Scanner(System.in);
	String input;
	static int inputCat;
	static int inputAli;
	static int inputPorte;

	public static void insereAnimais() {
		do {
			
			
			System.out.println("Categoria do animal a ser cadastrado");
			System.out.println("1 - Cachorro");
			System.out.println("2 - Cavalo");
			inputCat = scan.nextInt();

			if (inputCat != 1 && inputCat != 2) {
				System.out.println("Opção inválida! Selecione novamente.");
			}
		} while (inputCat != 1 && inputCat != 2);

		switch (inputCat) {

		case 1:
//			CadastroAnimais cachorro = new CadastroAnimais();
			System.out.println("Cadastro de Cachorro");
			do {
				System.out.println("Alimentação do Cachorro");
				System.out.println("1 - Ração");
				System.out.println("2 - Carne");
				System.out.println("3 - Menu");

				if (inputAli != 1 && inputAli != 2 && inputAli != 3) {
					System.out.println("Opção inválida! Selecione novamente.");
				} else if (inputAli == 3) {
					OperacaoAnimais.insereAnimais();
				} else if (inputAli == 1) {
					System.out.println("Dados do Cachorro");
					System.out.println("Digite o nome do cachorro: ");
					
				}
			} while (inputAli != 1 && inputAli != 2 && inputAli != 3);
			break;

		case 2:
			System.out.println("Cadastro de Cavalo");
			do {
				System.out.println("Porte do Cavalo");
				System.out.println("1 - Corrida");
				System.out.println("2 - Carga");
				System.out.println("3 - Menu");

				if (inputPorte != 1 && inputPorte != 2 && inputPorte != 3) {
					System.out.println("Opção inválida! Selecione novamente.");
				}
			} while (inputPorte != 1 && inputPorte != 2 && inputPorte != 3);
			break;
		}

	}
}
