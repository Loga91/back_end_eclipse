
public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente adrian = new Cliente();
		adrian.setNombre("Adrian");
		adrian.setDocumento("F25653");
		adrian.setTelefono("8331102647");
		
		Cuenta cuentaDeAdrian = new Cuenta(5, "6324887622316559");//como iniciamos el constructos Cuenta() y le dimos parametros para agencia,
											  // tenemos que colocar un numero de agencia
		//cuentaDeAdrian.setAgencia(15); ya se coloco la agencia
		cuentaDeAdrian.setTitular(adrian);
		
		System.out.println(cuentaDeAdrian.getTitular().getDocumento());
		System.out.println(cuentaDeAdrian.getTitular().getNombre());
		System.out.println(cuentaDeAdrian.getTitular().getTelefono());
		System.out.println(cuentaDeAdrian.getAgencia());
		System.out.println(cuentaDeAdrian.getTitular());
		System.out.print(adrian);
		}
}
