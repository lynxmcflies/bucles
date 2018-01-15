public class Ejercicio12 {
	public static void main (String[] args){
	
		int[] numero = new int[10];
		int i;		
		int x;
		int aux = 0;

		System.out.println("Introduce 10 números: ");
		for (i=0;i<10;i++){
			numero[i] = Integer.parseInt(System.console().readLine());
		}
		
		System.out.println("Ahora introduce la posición inicial y después la final: ");
		int inicial = Integer.parseInt(System.console().readLine());
		int fin = Integer.parseInt(System.console().readLine());
		
		
		for (i=0;i<10;i++){
			System.out.print(numero[i]+", ");
		}
		
		System.out.println();
			
		if((inicial<fin) && (inicial<10) && (fin<10)){
			
			aux = numero[9];
		
			for(x=9;x>0;x--){
				numero[x] = numero[x-1];
			}
			
			numero[0] = aux;
			
			numero[inicial] = numero[inicial--];
			numero[fin-1] = numero[inicial-1];
			
			for (i=0;i<10;i++){
				System.out.print(numero[i]+", ");
			}
			
		} else {
			System.out.println("Los numeros de inicio y fin son incorrectos");
		}
		
	}		
}
		
