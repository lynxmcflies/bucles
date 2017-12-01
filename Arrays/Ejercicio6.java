public class Ejercicio6 {
	public static void main (String[] args){
		int[] numero = new int[15];
		int i;
		int x;
		int aux = 0;
		
		System.out.println("Introduce quince numeros iyo: ");
		
		for (i=0;i<15;i++){
			numero[i] = Integer.parseInt(System.console().readLine());
		}
		
		aux = numero[14];
		
		for(x=14;x>0;x--){
			numero[x] = numero[x-1];
		}
		
		numero[0] = aux;
		
		for(x=0;x<15;x++){
			System.out.println(x+" : "+numero[x]);
		}
		
	}
}
