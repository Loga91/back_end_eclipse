
public class TestReferencia {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(15, "7894587622316559");//como iniciamos el constructos Cuenta() y le dimos parametros para agencia,
												// tenemos que colocar un numero de agencia
		//primeraCuenta.saldo = 400; variable saldo aislada, modificar saldo atravez de depositar y retirar
		primeraCuenta.depositar(400);
		Cuenta segundaCuenta = primeraCuenta;
		
		segundaCuenta.depositar(200);
		
		System.out.println(primeraCuenta.getSaldo());
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		}

}
