
public class TestCuenta {
	public static void main(String[] args) {
		CuentaDeAhorro ahorro = new CuentaDeAhorro(1, "198273659");
		CuentaCorriente corriente = new CuentaCorriente(2, "782910736");
		
		corriente.depositar(2000);
		corriente.tranferir(1000, ahorro);
		System.out.println(corriente.getSaldo());
		System.out.println(ahorro.getSaldo());
	}

}
