package java_primeros_pasos;

public class EjemploCiclosWhile2 {

	public static void main(String[] args) {
		System.out.println("Aprendiendo Ciclos");

		int contador = 0;
		int total = 0;
		while (contador <= 10) {

			total = total + contador;
			// System.out.println(contador);
			contador++;
		}
		System.out.println(total);
	}
}
