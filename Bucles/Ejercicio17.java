public class Ejercicio17 {
	public static void main (String[] args) {
		System.out.print("Introduce un número entero positivo: ");
		int introducido = Integer.parseInt(System.console().readLine());
		int i = 0;
		int x = 0;
		int y = introducido++;

		
		if (introducido>=0){
			for(i=0;i<100;i++){
				x = introducido+y;
				System.out.println(x);
				y = x;
				introducido++;
			}
		} else {
			System.out.println("El número introducido no es entero positivo");
		}
		
	}
}

