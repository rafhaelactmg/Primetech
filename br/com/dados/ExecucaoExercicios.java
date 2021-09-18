package br.com.dados;

import java.util.ArrayList;

import java.util.List;

public class ExecucaoExercicios {

	public static void main(String[] args) {
		
		
//		//Exercicio 1
//		Pessoa william = new Pessoa("William", 2000, 10, "Sistemas");
//		Pessoa thallys = new Pessoa("Thallys", 1500, 15, "TI");
//		Pessoa daniel = new Pessoa("Daniel", 2500, 12, "Qualidade");
//		Pessoa cadu = new Pessoa("Carlos", 5000, 5, "Diretoria");
//		Pessoa rafhaela = new Pessoa("Rafhaela", 10, 1000, "Sistemas");
//		Pessoa marcos = new Pessoa("Marcos", 3000, 12, "Qualidade");
//		
//		List<Pessoa> pessoas = new ArrayList<Pessoa>();
//		pessoas.add(william);
//		pessoas.add(thallys);
//		pessoas.add(daniel);
//		pessoas.add(cadu);
//		pessoas.add(marcos);
//		pessoas.add(rafhaela);
//		
//		for(Pessoa p : pessoas) {
//			System.out.println(p.toString());
//		}
		
		
		//Exercicio 2	
//		Fornecedor peca = new Fornecedor("FlashCar Auto-Peças", "123456789", Boolean.TRUE, 
//				new Endereco("Rua Limoeiros, 15", "São Bento", "Belo Horizonte", "Minas Gerais"));
//		Fornecedor uniforme = new Fornecedor("Soraia Confecções", "121212121212", Boolean.TRUE, 
//				new Endereco("Rua D, 24", "Simões", "Belo Horizonte", "Minas Gerais"));
//		Fornecedor presente = new Fornecedor("Tudo em Presentes", "54545454545", Boolean.TRUE, 
//				new Endereco("Avenida Tupi, 1254", "Vera Cruz", "Campinal", "São Paulo"));
//		Fornecedor alimento = new Fornecedor("Doceria Marion", "89898989898", Boolean.FALSE, 
//				new Endereco("Travessa 18", "Barroca", "Nova Iguaçu", "Rio de Janeiro"));
//		
//		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
//		fornecedores.add(alimento);
//		fornecedores.add(presente);
//		fornecedores.add(uniforme);
//		fornecedores.add(peca);
//		
//		for(Fornecedor f : fornecedores) {
//			System.out.println(f.toString());
//		}
		
		List<Endereco> filiais = new ArrayList<Endereco>();
		
		Endereco comercial = new Endereco("Rua Limoeiros, 15", "São Bento", "Belo Horizonte", "Minas Gerais");
		Endereco cobranca = new Endereco("Rua D, 24", "Simões", "Belo Horizonte", "Minas Gerais");
		
		
		Fornecedor peca = new Fornecedor ("FlashCar Auto-Peças", "123456789", Boolean.TRUE, filiais);
		
		peca.adicionarEndereco(comercial);
		peca.adicionarEndereco(cobranca);
		
		System.out.println(peca.toString());
			
	}

}
