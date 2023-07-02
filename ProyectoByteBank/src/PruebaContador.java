
public class PruebaContador {
	
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(2, "7894587622316559");
		Cuenta cuenta2 = new Cuenta(7, "7894587622316559");
		Cuenta cuenta3 = new Cuenta(5, "7894587622316559");
		
		System.out.println(Cuenta.getTotal());
	}

}
