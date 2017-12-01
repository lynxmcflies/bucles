public class Ejercicio10 {
	public static void main (String[] args){
	
		int[] numero = new int[20];
		int i;
		int[] guardar = new int[20];
		int contador = 0;


		for (i=0;i<20;i++){
			numero[i] = (int)(Math.random()*101);
		}
		
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
		
