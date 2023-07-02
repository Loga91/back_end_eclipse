
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaAdrian = new Cuenta(3, "7894587625312578");//como iniciamos el constructos Cuenta() y le dimos parametros para agencia,
											// tenemos que colocar un numero de agencia
		//cuentaAdrian.saldo = 400; variable saldo aislada, modificar saldo atravez de depositar y retirar
		cuentaAdrian.depositar(700);
		
		
		
		//System.out.println(cuentaAdrian.saldo);
		
		cuentaAdrian.retirar(500);
		System.out.println(cuentaAdrian.getSaldo());
		
		Cuenta cuentaSergio = new Cuenta(1, "7894545312316559");
		
		cuentaSergio.depositar(1000);
		System.out.println(cuentaSergio.getSaldo());
		cuentaSergio.tranferir(500, cuentaAdrian);
		System.out.println(cuentaSergio.getSaldo());
		System.out.println(cuentaAdrian.getSaldo());
	}

}
