package java_primeros_pasos;

public class EjemploScope {

	public static void main(String[] args) {

		double valorCompra = 325.0;
		double descuento = 0.0;
		
		boolean descuentoMinimo = valorCompra >= 100 && valorCompra <= 199.99;
		boolean descuentoMedio = valorCompra >= 200 && valorCompra <= 299.99;
		boolean descuentoMaximo = valorCompra >= 300;
		
		if (descuentoMinimo) {
			descuento = 10.0;
		}else if(descuentoMedio) {
			descuento = 15.0;
		}else if(descuentoMaximo) {
			descuento = 20.0;
		}
		
		double valorCompra2 = valorCompra - (valorCompra * (descuento/100));
		
		System.out.println("Su valor de compra es de " + valorCompra +" por lo que su descuento es del " + (int)descuento + "%, y su total es de $" + valorCompra2);

	}
}
