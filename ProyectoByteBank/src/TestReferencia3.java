
public class TestReferencia3 {

	public static void main(String[] args) {
		Cuenta cuentaAdrian = new Cuenta(3, "7894587622316897");//como iniciamos el constructos Cuenta() y le dimos parametros para agencia,
											// tenemos que colocar un numero de agencia
		cuentaAdrian.getTitular().setNombre("Enrique");
		System.out.println(cuentaAdrian.getTitular().getNombre());
	}
}
