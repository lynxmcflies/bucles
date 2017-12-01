public class Ejercicio15 {
	public static void main (String[] args) {
		System.out.print("Introduce una base: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce un exponente: ");
		int exponente = Integer.parseInt(System.console().readLine());
		int i;
		for (i=1;i<=exponente;i++){
			System.out.print(base+"^"+i+" ");
		}
	}
}

