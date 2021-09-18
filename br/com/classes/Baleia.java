package br.com.classes;

public class Baleia extends Animal {
	
	@Override
	public void mover() {
		System.out.println("A baleia nada");
	}
	
	@Override
	public String comer() {
		return super.comer();
	}

}
