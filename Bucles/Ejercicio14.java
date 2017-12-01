public class Ejercicio14 {
	public static void main (String[] args) {
		System.out.print("Introduce una base: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce un exponente: ");
		int exponente = Integer.parseInt(System.console().readLine());
		int mul = 0;
		int aux = 1;
		int i = 0;
		
		for(i=1;i<=exponente;i++){
			mul = aux*base;
			aux = mul;
		}
		System.out.println("El resultado es: "+aux);
		
	}
}

