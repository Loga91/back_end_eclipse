
public class ControlBonificaciones {
	
	private double sumaBonificaciones;
	
	//al utilizar este metodo ya no tendremos que crear un metodo diferente para cada clase que extienda de Funcionario
	//ya que al extender de la misma clase, el codigo funciona siempre que cuenten con los atributos necesarios
	public double registrarSalario (Funcionario funcionario) {
		this.sumaBonificaciones = funcionario.getBonificacion()	+ this.sumaBonificaciones;
		System.out.println(this.sumaBonificaciones);
		return this.sumaBonificaciones;
	}
	
	public double getSumabonificaciones() {
		return sumaBonificaciones;
	}

}
