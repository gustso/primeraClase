package ar.edu.unju.edm;
import ar.edu.unju.edm.model.Calculadora;

public class PrimerEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Gustavo";
		brindarNombre(nombre);
		
		
		int numeroA = 2;
		int numeroB = 5;
		
		Calculadora unaCalculadora = new Calculadora();
		
		unaCalculadora.resolverSuma(numeroA,numeroB);
		unaCalculadora.resolverPotencia(numeroA, numeroB);
		//System.out.println("Resultado de la SUMA: " + (numeroA + numeroB));
		//System.out.println("Resultado de la RESTA: " + (numeroA - numeroB));
	}
	
	public static void brindarNombre(String nombreUsuario) {
		System.out.println("Hola Mundo!, Bienvenido " + nombreUsuario.toUpperCase());
	}

}
