
public class TestReferencias {
	public static void main(String[] args) {
		
		// El elemento mas generico puede hacer referencia al elemento mas especifico
		Funcionario funcionario = new Gerente();
		funcionario.setDocumento("Adrian");
		funcionario.setSalario(2000);
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Sergio");
		gerente.setSalario(5000);
		
		System.out.println(funcionario.getBonificacion());
	}

}
