public class Ejercicio12 {
	public static void main (String[] args) {
		
		System.out.println("La serie Fibonacci es: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…");
		System.out.print("Introduce un número: ");
		int introducido = Integer.parseInt(System.console().readLine());
		int i = 0;
		int siguiente = 1;
		int aux = 0;
		
		switch (introducido) {
			case 1: 
				System.out.println("0");
				break;
			case 2:
				System.out.println("1");
				break;
			default:
				System.out.println("0");
				for(i=2;i<=introducido;i++){
					int suma = siguiente + aux;
					System.out.println(suma);
					siguiente = aux;
					aux = suma;
				}
		}
		
	}
}


