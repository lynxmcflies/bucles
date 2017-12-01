public class Ejercicio11 {
	public static void main (String[] args) {
		
		int i = 0;
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		
		for(i=0;i<20;i++){
			int nota = (int)(Math.random()*11);
			if (nota<5){
				System.out.println("Suspenso: "+nota);
				suspenso++;
			} else if (nota == 5){
				System.out.println("Suficiente: "+nota);
				suficiente++;
			} else if (nota == 6){
				System.out.println("Bien: "+nota);
				bien++;
			} else if ((nota > 6) && (nota < 9)){
				System.out.println("Notable: "+nota);
				notable++;
			} else if (nota > 8){
				System.out.println("Sobresaliente: "+nota);
				sobresaliente++;
			}
		}
		
		System.out.println(" ");
		System.out.println("Has obtenido "+suspenso+" suspensos");
		System.out.println("Has obtenido "+suficiente+" suficientes");
		System.out.println("Has obtenido "+bien+" bien");
		System.out.println("Has obtenido "+notable+" notables");
		System.out.println("Has obtenido "+sobresaliente+" sobresalientes");
	}
}


