public class Ejercicio9 {
	public static void main (String[] args){
	
		int[] numero = new int[12];
		int i;
		
		System.out.println("Introduce 8 número enteros");
		
		for (i=0;i<8;i++){
			numero[i] = Integer.parseInt(System.console().readLine());
		}
		
		for (i=0;i<8;i++){
			if (numero[i]%2==0){
				System.out.println(numero[i]+" par");
			} else {
				System.out.println(numero[i]+" impar");
			}
		}
	}		
}
		
