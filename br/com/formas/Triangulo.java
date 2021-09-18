package br.com.formas;

import java.math.BigDecimal;

public class Triangulo extends ObjetoGeometrico {
	
	@Override
	public String tipoForma() {
		this.setQtdeLados(3);
		return super.tipoForma();
	}
	
	@Override
	public BigDecimal calculoArea() {
		this.setBase(new BigDecimal(12));
		this.setAltura(new BigDecimal(20));
		return super.calculoArea();
	}

}
