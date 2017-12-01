public class Ex24apv1 {
	public static void main (String[] args) {
		
		int i = 0;
		int x = 2;
		int introducido = 0;
		boolean esPrimo = false;
		
		for(i=0;!esPrimo;i++){
			System.out.print("Introduce un número: ");
			introducido = Integer.parseInt(System.console().readLine());
			esPrimo = true;
			for (x=2;x<introducido;x++){
				if((introducido%x) == 0){
					esPrimo = false;
				}
			}
			if (esPrimo == false){
				System.out.println("no es primo");
			} else {
				System.out.println("es primo");
			}
		}
		


		
		

	}
}

