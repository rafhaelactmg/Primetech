package br.com.formas;

import java.math.BigDecimal;

public class Quadrado extends ObjetoGeometrico {
	
	@Override
	public String tipoForma() {
		this.setQtdeLados(4);
		return super.tipoForma();
	}
	
	@Override
	public BigDecimal calculoArea() {
		this.setLado(new BigDecimal (10));
		return super.calculoArea();
	}

}
