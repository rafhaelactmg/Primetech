package br.com.decisao;

public class ControleLoopFor {
	public static void main(String[] args) {
		
//		//Contador
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		//For aninhado contador
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
		
		//Interando array com For
		int [] numbers = {10, 20, 30, 40, 50};
		for (int x : numbers) {
			System.out.print(x);
			System.out.print(", ");
		}
		System.out.println("\n");
		String [] names = {"James", "Larry", "Tom", "Lacy"};
		
		for(String name : names) {
			System.out.print(name);
			System.out.print(", ");
		}
	}
}
