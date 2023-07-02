package project_switch_expression;

public class ExpresionSwitch {

	// https://oregoom.com/java/switch/
	public static void main(String[] args) {
		int dia = 6;

		String diaDeLaSemana = switch (dia) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		case 3 -> "Miercoles";
		case 4 -> "Jueves";
		case 5 -> "Viernes";
		case 6 -> "Sabado";
		case 7 -> "Domingo";
		default -> "No existe el dia";

		};
		System.out.println("El dia de la semana es: " + diaDeLaSemana);
	}
}
