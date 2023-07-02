
public class Cliente {
	
	private String nombre;
	private String documento;
	private String telefono;
	
	public static boolean validarNombre(String nombre) { //validacion de escritura de nombre 
		return nombre.matches("^[A-Z]{1}[a-z]+$");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) { //si cumple la validacion de escritura de nombre, el nombre 
		if (validarNombre(nombre) == true) {//escrito pasa a ser el valor de la variable
			this.nombre = nombre;
		}else {
			System.out.println("Escriba su nombre correctamente, ejemplo Pedro");
		}
		
	}
	
	public static boolean validarDocumento(String documento) {//validacion de escritura de documento 
		return documento.matches("^[A-Z]{1}[0-9]{5}$");
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {//si cumple la validacion de escritura del documento, se acepta el formato dado
		if (validarDocumento(documento)==true) {
			this.documento = documento;
		}else {
			System.out.println("Este documento es invalido");
		}
		
	}
	
	public static boolean validarTelefono(String telefono) {//validacion de escritura de telefono 
		return telefono.matches("^[0-9]{10}$");
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {//si cumple la validacion de escritura del telefono, se acepta el formato dado
		if (validarTelefono(telefono)== true) {
			this.telefono = telefono;
		}else {
			System.out.println("Escriba los 10 digitos de su numero telefonico");
		}
		
	}
	

}
