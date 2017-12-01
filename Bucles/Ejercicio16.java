public class Ejercicio16 {
	public static void main (String[] args) {
		System.out.print("Introduce un número: ");
		double introducido = Integer.parseInt(System.console().readLine());
		int i;
		boolean esPrimo = true;
		for (i=2;i<introducido;i++){
			if((introducido%i) == 0){
				esPrimo = false;
			}
		}
		if (esPrimo == true){
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
	}
}

