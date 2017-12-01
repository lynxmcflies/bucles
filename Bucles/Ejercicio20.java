public class Ejercicio20 {
	public static void main (String[] args) {
		System.out.println("Introduce la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce el caracter con el que qieres que se dibuje la pirámide: ");
		String caracter = System.console().readLine();
		int i = 1;
		int altura = 1;
		int espacios = alturaIntroducida-1;
		
		while(altura<=alturaIntroducida){
			
			for(i=1;i<=espacios;i++){
				System.out.print(" ");
			}
			
			for(i=1;i<altura*2;i++){
				
				System.out.print(caracter);
				for(i=1;;i++){
				
				}
				
			}
			
			System.out.println();
			
			altura++;
			espacios--;
		}

	}
}

