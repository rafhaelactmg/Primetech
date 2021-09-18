package br.com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArquivo {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:\\ambiente\\novoArquivo.txt");
			out = new FileOutputStream("C:\\ambiente\\novoArquivoCopiado.txt");
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

}
