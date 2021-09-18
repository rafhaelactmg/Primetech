package br.com.formas;

public class ExecucaoFormas {
	
	public static void main(String[] args) {
		
		ObjetoGeometrico quadrado = new Quadrado();
		ObjetoGeometrico triangulo = new Triangulo();
		
		System.out.println(quadrado.tipoForma());		
		System.out.println(quadrado.calculoArea());
		
		System.out.println(triangulo.tipoForma());		
		System.out.println(triangulo.calculoArea());
		
	}

}
