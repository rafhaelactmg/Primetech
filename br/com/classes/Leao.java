package br.com.classes;

public class Leao extends Animal {
	
	@Override
	public void mover() {
		System.out.println("O le�o corre");
	}
	
	@Override
	public String comer() {
		this.setCarnivoro(Boolean.TRUE);
		return super.comer();
	}

}
