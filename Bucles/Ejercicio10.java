public class Ejercicio10 {
	public static void main (String[] args) {
		
		int i = 0;
		int introducido = 0;
		int suma = 0;
		
		for(i=0;introducido>=0;i++){
			System.out.print("Introduce un número: ");
			introducido = Integer.parseInt(System.console().readLine()); 
			suma = suma+introducido; 
		}
		System.out.print("Resultado: "+((suma-introducido)/(i-1))); 
		
	}
}

