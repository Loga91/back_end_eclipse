//                   extiende de
public class Gerente extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "r2okBwsJbe";
	}
	
	//Se ve como la clase Gerente esta llamando al metodo getSalario de la clase Funcionario con super
	//El gerente tiene una bonificación diferente, tiene la bonificación de un empleado común más un salario.
	public double getBonificacion() {//esto es sobreescriura de método
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + super.getBonificacion();
	}
}
