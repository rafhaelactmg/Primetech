package br.com.streams;

import java.io.File;

public class DeletarArquivo {
	
	public static void main(String[] args) {
		try {
			File file = new File("C:\\ambiente\\novoArquivo.txt");
			file.delete();
		} catch (Exception e) {
			System.out.println("Não conseguimos excluir");
		}
	}

}
