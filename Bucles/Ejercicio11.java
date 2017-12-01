public class Ejercicio11 {
	public static void main (String[] args) {
		
		System.out.print("Introduce un número: ");
		int introducido = Integer.parseInt(System.console().readLine());
		int i = 0;

		for (i=0;i<5;i++){
			System.out.println("Número		Cuadrado		Cubo");
			System.out.println(introducido+ "		"+ (introducido*introducido)+"			"+(introducido*introducido*introducido));
			introducido++;
		}
		
		
	}
}


