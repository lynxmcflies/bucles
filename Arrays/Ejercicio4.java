public class Ejercicio4 {
	public static void main (String[] args){
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		int i = 0;
		int x = 0;
		int z = 0;
		
		for(i=0;i<20;i++){
			numero[i] = (int)(Math.random()*101);
			cuadrado[i] = numero[i]*numero[i];
			cubo[i] = numero[i]*numero[i]*numero[i];
			System.out.print(i+" =	"+numero[i]+"	"+cuadrado[i]+"	"+cubo[i]);
			System.out.println();
		}
		
		
		
	}
}

