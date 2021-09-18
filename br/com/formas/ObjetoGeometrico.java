package br.com.formas;

import java.math.BigDecimal;

import br.com.interfaces.ObjCirculo;
import br.com.interfaces.ObjQuadrilatero;
import br.com.interfaces.ObjTrilatero;


public class ObjetoGeometrico implements ObjCirculo, ObjQuadrilatero, ObjTrilatero {
	
	private String nome;
	private int qtdeLados;
	private BigDecimal lado;
	private BigDecimal base;
	private BigDecimal altura;
	private BigDecimal raio;
	
	
	public BigDecimal getBase() {
		return base;
	}
	public BigDecimal getLado() {
		return lado;
	}
	public void setLado(BigDecimal lado) {
		this.lado = lado;
	}
	public void setBase(BigDecimal base) {
		this.base = base;
	}
	public BigDecimal getAltura() {
		return altura;
	}
	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}
	public BigDecimal getRaio() {
		return raio;
	}
	public void setRaio(BigDecimal raio) {
		this.raio = raio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdeLados() {
		return qtdeLados;
	}
	public void setQtdeLados(int qtdeLados) {
		this.qtdeLados = qtdeLados;
	}
	
	public String tipoForma() {
		if (qtdeLados == 3) {
			return "Trilatero";
		} else if (qtdeLados == 4) {
			return "Quadrilatero";
		} else if (qtdeLados == 0){
			return "Circulo";
		} else {
			return "Indefinido";
		}
	}
	
	public BigDecimal calculoArea() {
		if (qtdeLados == 3) {
			return calcTri(this.base, this.altura);
		} else if (qtdeLados == 4) {
			return calcQuad(this.lado);
		} else if (qtdeLados == 0) {
			return calcCirc(this.raio, (new BigDecimal (Math.PI)));
		} else {
			return null;
		}
	}
	
	
	@Override
	public BigDecimal calcQuad(BigDecimal lado) {
		return lado.multiply(lado);
	}
	@Override
	public BigDecimal calcCirc(BigDecimal raio, BigDecimal pi) {
		return pi.multiply(raio.pow(2));
	}
	@Override
	public BigDecimal calcTri(BigDecimal base, BigDecimal altura) {
		int n = 2;
		return base.multiply(altura).divide(new BigDecimal(n));
	}

}
