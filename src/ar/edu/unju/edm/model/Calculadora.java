package ar.edu.unju.edm.model;

public class Calculadora {
	
	public void resolverSuma(int primerNumero, int segundoNumero) {
		int resultado = primerNumero + segundoNumero;
		System.out.println("Resultado SUMA: "+resultado);
	}
	
	public void resolverPotencia(int base, int exponente) {
		//double resultado = Math.pow(base, exponente);
		int resultado = (int) Math.pow(base, exponente);
		System.out.println("Resultado POTENCIA: "+resultado);
	}

}
