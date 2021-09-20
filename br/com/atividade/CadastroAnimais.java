package br.com.atividade;

import br.com.interfaces.Cachorro;
import br.com.interfaces.Cavalo;

public class CadastroAnimais implements Cachorro, Cavalo {
	
	private String nome;
	private int idade;
	private double altura;
	

	public CadastroAnimais(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "--Animal:" + novaLinha + "Nome: " + nome + novaLinha + "Idade: " + idade + novaLinha + "Altura: " + altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String cavaloCorrida() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cavaloCarga() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String comerCarne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String comerRacao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Auxiliar para quebra de linha
	String novaLinha = System.getProperty("line.separator");

}
