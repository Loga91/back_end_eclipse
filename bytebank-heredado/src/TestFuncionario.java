
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario adrian = new Funcionario();
		adrian.setNombre("Adrian");
		adrian.setDocumento("172333");
		adrian.setSalario(2000);
		adrian.setTipo(0);
		
		
		
		System.out.println(adrian.getBonificacion());
	}
}
