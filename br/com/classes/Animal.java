package br.com.classes;

import java.math.BigDecimal;

import br.com.interfaces.Carnivoro;
import br.com.interfaces.Herbivoro;

public class Animal implements Carnivoro, Herbivoro {
	
	private String especie;
	private BigDecimal tamanho;
	private String cor;
	private BigDecimal peso;
	private Integer qtdePatas;
	private Boolean carnivoro;
	
	//Getters & Setters
	
	public Boolean getCarnivoro() {
		return carnivoro;
	}

	public void setCarnivoro(Boolean carnivoro) {
		this.carnivoro = carnivoro;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public BigDecimal getTamanho() {
		return tamanho;
	}

	public void setTamanho(BigDecimal tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Integer getQtdePatas() {
		return qtdePatas;
	}

	public void setQtdePatas(Integer qtdePatas) {
		this.qtdePatas = qtdePatas;
	}
	
	//Methods
	
	public String comer() {
		if (carnivoro != null && carnivoro) {
			return comerCarne();
		} else if (carnivoro != null && !carnivoro) {
			return comerVegetal();
		} else {
			return "Comer ovo";
		}
		
		
	}
	
	public void dormir() {
		
	}
	
	public void mover() {
		System.out.println("O animal se move");
		
	}
	
	public void emitirSom() {
		System.out.println("O animal emite algum som");
		
	}
	
	public void nadar() {
		
	}
	
	//Interfaces

	@Override
	public String comerVegetal() {
		return "Comer campim";
	}

	@Override
	public String comerCarne() {
		return "Comer bife";
	}

}
