
public class CrearCuenta {
	
	public static void main(String[] args) {
		
		Cuenta primerCuenta = new Cuenta(2, "1523467892103562");
		//primerCuenta.saldo = 100; variable saldo aislada, modificar saldo atravez de depositar y retirar
		primerCuenta.depositar(400);
		System.out.println(primerCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(3, "153489762345896");
		segundaCuenta.depositar(500);;
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primerCuenta);
		System.out.println(segundaCuenta);
	}

}
