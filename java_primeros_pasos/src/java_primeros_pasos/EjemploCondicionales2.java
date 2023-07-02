package java_primeros_pasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Pruebas de Boleanos");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {

			System.out.println("Usted no puede entrar");
		}
	}

}
