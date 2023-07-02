
class Cuenta {
	private double saldo;
	private int agencia;
	private String numero;
	private Cliente titular = new Cliente();
	
	public static int total = 0;

	public Cuenta(int agencia, String numero) {
		if (agencia <= 0) {
			System.out.println("No se permiten numero menores que 0");
			this.agencia = 1; 
		}else {
		this.agencia = agencia;
		}
		if(validarNumero(numero)== true) {
			this.numero = numero;
		}else {
			System.out.println("Escriba los 16 digitos de su numero de cuenta");
		}
		total++;
		System.out.println("Se van creando: "+ total + " cuentas");
	}

	// No retorna valor
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	// Retorna valor
	public boolean retirar(double valorRetiro) {
		if (this.saldo >= valorRetiro) {
			this.saldo -= valorRetiro;
			return true;
		}
		return false;

	}

	public boolean tranferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int agencia) {//como ya le pedimos los parametros al constructor, podriamos quitar este codigo
		if (agencia > 0) {				 //si ya no pensamos que se pueda modificar mas adelante el parametro colocado
			this.agencia = agencia;
		} else {
			this.agencia = 1;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public static boolean validarNumero(String numero) {//validacion de escritura de numero de cuenta
		return numero.matches("^[0-9]{16}$");
	}
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {//como ya le pedimos los parametros al constructor, podriamos quitar este codigo
		if(validarNumero(numero)== true) {//si ya no pensamos que se pueda modificar mas adelante el parametro colocado
		this.numero = numero;
		}
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
}
