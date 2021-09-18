package br.com.classes;

public class Cavalo extends Animal {
	
	@Override
	public void emitirSom() {
		System.out.println("O cavalo relincha");
	}
	
	@Override
	public void mover() {
		System.out.println("O cavalo trota");
	}
	
	@Override
	public String comer() {
		this.setCarnivoro(Boolean.FALSE);
		return super.comer();
	}

}
