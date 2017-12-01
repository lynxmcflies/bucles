public class Ex24apv2 {
	public static void main (String[] args) {
		
		double alto = 0;
		double ancho = 0;
		double precioBase = 0;
		double bordadoPrecio = 0;
		
		
		System.out.print("Introduzca la altura de la bandera en cm: ");
		alto = Integer.parseInt(System.console().readLine());
		System.out.println("Ahora introduzca la anchura: ");
		ancho = Integer.parseInt(System.console().readLine());
		System.out.println("¿Quieres bordado? (s/n)");
		String bordado = System.console().readLine();
		
		precioBase = (ancho*alto)*0.01;
		
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.println("Bandera de "+ancho*alto+" cm^2: "+precioBase+" €");
		
		if(bordado.equals("n")){
			System.out.println("Sin escudo: 0.00 €");
			
		} else if (bordado.equals("s")){
			System.out.println("Con escudo: 2.50 €");
			bordadoPrecio = 2.5;
		}
		
		System.out.println("Gastos de envío: 3.25 €");
		
		double total = precioBase+bordadoPrecio+3.25;
		System.out.println("Total: "+total+" €");
	}
}

