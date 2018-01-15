public class Ejercicio11 {
	public static void main (String[] args){
	
		int[] numero = new int[10];
		int i;
		int x;
		int[] guardar = new int[10];
		int contador = 0;

		System.out.println("Introduce 10 números: ");
		for (i=0;i<10;i++){
			numero[i] = Integer.parseInt(System.console().readLine());
		}
		for (i=0;i<10;i++){
			System.out.print("|"+i+"|");
		}
		System.out.println();
		
		//primos
		for (i=0;i<10;i++){
			boolean esPrimo = true;
			for (x=2;x<numero[i];x++){
				if((numero[i]%x) == 0){
					esPrimo = false;
				}
			}
			if (esPrimo == true){
				guardar[contador] = numero[i];
				contador++;
			}
		}
		//no primos
		for (i=0;i<10;i++){
			boolean esPrimo = true;
			for (x=2;x<numero[i];x++){
				if((numero[i]%x) == 0){
					esPrimo = false;
				}
			}
			if (esPrimo == false){
				guardar[contador] = numero[i];
				contador++;
			}
		}
		//resultado
		for (i=0;i<10;i++){
			System.out.print("|"+guardar[i]+"|");
		}
		
	}		
}
		

