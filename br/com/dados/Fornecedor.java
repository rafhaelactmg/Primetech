package br.com.dados;

import java.util.List;

public class Fornecedor {
	
	private String nome;
	private String cpfcnpj;
	private Boolean credenciado;
	private Endereco endereco;
	private List<Endereco> filiais;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpfcnpj;
	}
	public void setCpf(String cpf) {
		this.cpfcnpj = cpf;
	}
	public Boolean getCredenciado() {
		return credenciado;
	}
	public void setCredenciado(Boolean credenciado) {
		this.credenciado = credenciado;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Endereco> getFiliais() {
		return filiais;
	}
	public void setFiliais(List<Endereco> filiais) {
		this.filiais = filiais;
	}
	
	
	public void adicionarEndereco (Endereco e) {
		filiais.add(e);
	}
	
	
	
	public Fornecedor(String nome, String cpfcnpj, Boolean credenciado, List<Endereco> filiais) {
		super();
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.credenciado = credenciado;
		this.filiais = filiais;
	}
	
	
	@Override
	public String toString() {
		return "Fornecedor" + novaLinha + "Nome: " + nome + novaLinha + "CPF/CNPJ: " + cpfcnpj + novaLinha + 
				"Credenciado: " + credenciado + novaLinha + filiais.toString();
	}
	

	//Auxiliar para quebra de linha
	String novaLinha = System.getProperty("line.separator");

}
