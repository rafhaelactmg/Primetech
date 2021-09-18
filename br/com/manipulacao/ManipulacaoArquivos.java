package br.com.manipulacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ManipulacaoArquivos {
	
	//Criar arquivo
	public void criarArquivo(String caminho) {
		File file = new File(caminho);
		boolean result;
		try {
			result = file.createNewFile();
			if (result) {
				System.out.println(file.getCanonicalPath());
			} else {
				System.out.println("File alredy exist at location " + file.getCanonicalFile());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Copiar arquivo
	public void copiarArquivo (String caminhoA, String caminhoB) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(caminhoA);
			out = new FileOutputStream(caminhoB);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
	
	//Deletar arquivo
	public void deletarArquivo(String caminho) {
		try {
			File file = new File(caminho);
			file.delete();
		} catch (Exception e) {
			System.out.println("Não conseguimos excluir");
		}
	}
	
	//Ler arquivo
	public void lerArquivo(String caminho) {
		try {
			InputStream is = new FileInputStream(caminho);
			int size = is.available();
			
			for (int i = 0; i < size; i++) {
				System.out.println((char) is.read() + " ");
			}
			is.close();
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}
	
	
}
