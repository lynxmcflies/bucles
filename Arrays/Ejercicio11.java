public class Ejercicio11 {
	public static void main (String[] args){
	
		int[] numero = new int[10];
		int i;
		int[] guardar = new int[10];
		int contador = 0;

		System.out.println("Introduce 10 números: ");
		for (i=0;i<10;i++){
			numero[i] = Integer.parseInt(System.console().readLine());
		}
		for (i=0;i<10;i++){
			System.out.println(i+": "numero[i]);
		}
		
		///////////////////////// lo de abajo no vale, es para modificar
		for (i=0;i<20;i++){
			if (numero[i]%2==0){
				guardar[contador]=numero[i];
				contador++;
			}
		}
		
		for (i=0;i<20;i++){
			if (numero[i]%2!=0){
				guardar[contador]=numero[i];
				contador++;
			}
		}
		
		for (i=0;i<20;i++){
			System.out.print(guardar[i]+", ");
		}
		
	}		
}
		

