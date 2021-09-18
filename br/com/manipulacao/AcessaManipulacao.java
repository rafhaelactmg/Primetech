package br.com.manipulacao;

import java.io.IOException;
import java.util.Scanner;

public class AcessaManipulacao {

	public static void main(String[] args) throws IOException {
		
		int input;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		ManipulacaoArquivos arq = new ManipulacaoArquivos();
		
		
do {
			
			System.out.println("|-------------------------------------|");
			System.out.println("|      TECLA         OPERAÇÃO         |");
			System.out.println("|-------------------------------------|");
			System.out.println("|        1        CRIAR ARQUIVO       |");
			System.out.println("|-------------------------------------|");
			System.out.println("|        2        COPIAR ARQUIVO      |");
			System.out.println("|-------------------------------------|");
			System.out.println("|        3         LER ARQUIVO        |");
			System.out.println("|-------------------------------------|");
			System.out.println("|        4        DELETAR ARQUIVO     |");
			System.out.println("|-------------------------------------|");
			System.out.println("|        5             SAIR           |");
			System.out.println("|-------------------------------------|");
			
			System.out.println("Escolha uma opção: ");
			input = scan.nextInt();	
			
			if (input != 1 && input != 2 && input != 3 && input != 4 && input != 5) {
				System.out.println("Opção inválida! Digite uma opção do menu.");
				System.in.read();	
			}
		} while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5);
		
		switch(input) {
		
		case 1:
			criarArquivo(args, scan, arq);
			break;

		case 2:
			copiarArquivo(args, scan, arq);
			break;
			
		case 3:
			lerArquivo(args, scan, arq);
			break;
			
		case 4:
			deletarArquivo(args, scan, arq);
			break;	
			
		case 5:
			System.exit(0);
        	break;
		}

	}

	private static void criarArquivo(String[] args, Scanner scan, ManipulacaoArquivos arq) throws IOException {
		String caminho;
		System.out.println("Insira o caminho para criação do arquivo: ");
		caminho = scan.next();
		arq.criarArquivo(caminho);
		System.out.println("Arquivo criado com sucesso no caminho especificado.");
		System.in.read();
		AcessaManipulacao.main(args);
	}

	private static void copiarArquivo(String[] args, Scanner scan, ManipulacaoArquivos arq) throws IOException {
		System.out.println("Insira o caminho de origem do arquivo: ");
		String caminhoOrigem = scan.next();
		System.out.println("Insira o caminho de destino do arquivo: ");
		String caminhoDestino = scan.next();
		arq.copiarArquivo(caminhoOrigem, caminhoDestino);
		System.out.println("Arquivo copiado para o caminho especificado.");
		System.in.read();
		AcessaManipulacao.main(args);
	}

	private static void lerArquivo(String[] args, Scanner scan, ManipulacaoArquivos arq) throws IOException {
		String caminho;
		System.out.println("Insira o caminho do arquivo a ser lido: ");
		caminho = scan.next();
		arq.lerArquivo(caminho);
		System.out.println("\n");
		System.out.println("Tecle 'ENTER' para retornar ao Menu.");
		System.in.read();
		AcessaManipulacao.main(args);
	}

	private static void deletarArquivo(String[] args, Scanner scan, ManipulacaoArquivos arq) throws IOException {
		String caminho;
		System.out.println("Insira o caminho para o arquivo a ser excluído: ");
		caminho = scan.next();
		arq.deletarArquivo(caminho);
		System.out.println("Arquivo excluído com sucesso.");
		System.in.read();
		AcessaManipulacao.main(args);
	}

}
