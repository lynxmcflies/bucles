public class Ejercicio13 {
	public static void main (String[] args) {
		
		int i = 0;
		int positivos = 0;
		int negativos = 0;
		for (i=0;i<10;i++){
			System.out.println("Introduce un número positivo o negativo: ");
			int introducido = Integer.parseInt(System.console().readLine());
			if (introducido>=0){
				positivos++;
			} else {
				negativos++;
			}
		}
		System.out.println("Has introducido "+positivos+" números positivos y "+negativos+" números negativos.");
		
	}
}

