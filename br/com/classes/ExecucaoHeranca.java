package br.com.classes;

public class ExecucaoHeranca {

	public static void main(String[] args) {
		
		Animal leao = new Leao();
		Animal cavalo = new Cavalo();
		Animal baleia = new Baleia();
		
		
//		cavalo.emitirSom();
//		leao.emitirSom();
//		baleia.emitirSom();
		
//		cavalo.mover();
//		leao.mover();
//		baleia.mover();
		
		System.out.println(cavalo.comer());
		System.out.println(leao.comer());
		System.out.println(baleia.comer());
	}

}
