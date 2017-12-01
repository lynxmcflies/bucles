public class Ejercicio6 {
	public static void main (String[] args) {
		
		int i = 0;
		int azar = ((int)(Math.random()*101));
		int intentos = 4;
		int introducido = 0;
		
		for(i=0;i<5&&introducido!=azar;i++){
			System.out.println("Intenta acertar el número que estoy pensando del 0 al 100");
			introducido = Integer.parseInt(System.console().readLine());
			if(introducido==azar){
				System.out.println("Has acertado!");
			} else {
				if (intentos == 1){
					System.out.println("Te equivocaste, último intento!");
				} else if (intentos == 0){
					System.out.println("Lo siento, agotaste todas tus oportunidades");
				} else {
					System.out.println("Te equivocaste, tienes "+intentos+" intentos más: ");
				}
			}
			intentos--;
		}
		
	}
}

