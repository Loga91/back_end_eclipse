
public class TestControlBonificaciones {
	
	public static void main(String[] args) {
		Funcionario sergio = new Funcionario();
		sergio.setSalario(2000);
		
		Gerente adrian = new Gerente();
		adrian.setSalario(5000);
		
		Contador tayde = new Contador();
		tayde.setSalario(4000);
		
		ControlBonificaciones control = new ControlBonificaciones();
		control.registrarSalario(sergio);
		control.registrarSalario(adrian);
		control.registrarSalario(tayde);
	}
	
}
	
