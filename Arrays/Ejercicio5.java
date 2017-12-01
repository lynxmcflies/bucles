public class Ejercicio5 {
	public static void main (String[] args){
		int[] numero = new int[10];
		int i = 0;
		int masAlto = 0;
		int masBajo = 9999;
		
		for (i=0;i<10;i++){
			System.out.println("Introduce un numero iyo: ");
			numero[i] = Integer.parseInt(System.console().readLine());
			if(numero[i] > masAlto){
				masAlto = numero[i];
			}
			if(numero[i] < masBajo){
				masBajo = numero[i];
			}
		}
		
		for (i=0;i<10;i++){
			if(numero[i] == masAlto){
				System.out.println(i+" = "+numero[i]+" es el número más alto");
			} else if (numero[i] == masBajo){
				System.out.println(i+" = "+numero[i]+" es el número más bajo");
			} else {
				System.out.println(i+" = "+numero[i]);
			}
		}
	}
}

