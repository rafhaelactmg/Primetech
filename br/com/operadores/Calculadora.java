package br.com.operadores;

public class Calculadora {

	public long somar(long a, long b) {
		return a + b;
	}

	public long subtrair(long a, long b) {
		return a - b;
	}

	public long multiplicar(long a, long b) {
		return a * b;
	}

	public long dividir(long a, long b) {
		if (b != 0) {
			return a / b;
		}
		return 0;
	}

	public Boolean isPar(long a) {
		if (a != 0 && (a % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isIgual(long a, long b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	public long incrementar(long x) {
		return ++x;
	}

	public long decrementar(long x) {
		return --x;
	}

	public Boolean isPrimo(long num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
