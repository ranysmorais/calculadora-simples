package br.com.calculadora.formula;

public class Calculos {
	private Double r;
	
	public Double Soma(Double a, Double b) {
		return this.r = a + b;
	}
	
	public Double Subtrai(Double a, Double b) {
		return this.r = a - b;
	}
	
	public Double Divide(Double a, Double b) {
		return this.r = a / b;
	}
	
	public Double Multiplica(Double a, Double b) {
		return this.r = a * b;
	}
	
	public Double Resultado() {
		return r;
	}

}
