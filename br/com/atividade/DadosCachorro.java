package br.com.atividade;


public class DadosCachorro {

	private String nome;
	private int idade;
	private double altura;

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

	public DadosCachorro(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "--Cachorro:" + novaLinha + "Nome: " + nome + novaLinha + "Idade: " + idade + novaLinha + "Altura: " + altura;
	}
	
	//Auxiliar para quebra de linha
		String novaLinha = System.getProperty("line.separator");

}
