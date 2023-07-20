
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, String numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean retirar(double valorRetiro) {
		double comision = 0.2;//comision por tranferencia de 20 centavos
		return super.retirar(valorRetiro + comision);
	}
	
}
