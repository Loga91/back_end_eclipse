
public class PruebaAcceso {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(15, "7894587622398213");//como iniciamos el constructos Cuenta() y le dimos parametros para agencia,
										// tenemos que colocar un numero de agencia
		/*cuenta.saldo = 200; una vez aislada la variable saldo, no podra ser modificada directamente,
		; solo por las variables depositar y retirar.
		cuenta.saldo = cuenta.saldo - 300;*/
		cuenta.depositar(400);
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
		
		cuenta.setAgencia(-15);
		System.out.println(cuenta.getAgencia());
		
	}

}
