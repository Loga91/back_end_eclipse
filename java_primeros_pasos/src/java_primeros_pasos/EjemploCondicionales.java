package java_primeros_pasos;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Pruebas de Boleanos");

		int edad = 14;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero puede ingresar");
			} else
				System.out.println("Usted no puede entrar");
		}
	}

}
