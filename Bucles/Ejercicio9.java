public class Ejercicio9 {
	public static void main (String[] args) {
		System.out.print("Introduce un número: ");
		long introducido = Integer.parseInt(System.console().readLine());
		long i = 0;
		
		for(i=0;introducido>0;i++){
			introducido = introducido/10;
		} System.out.println("Tiene "+i+" cifras");
		
	}
}

