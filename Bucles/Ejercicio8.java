public class Ejercicio8 {
	public static void main (String[] args) {
		System.out.print("Introduce un número: ");
		int introducido = Integer.parseInt(System.console().readLine());
		int i = 0;
		
		for(i=0;i<11;i++){
			System.out.println(introducido + "x" + i + " = "+introducido*i);
		}
		
	}
}

