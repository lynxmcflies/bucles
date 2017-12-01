public class Ejercicio3 {
	public static void main (String[] args){
		int i = 0;
		int x = 9;
		int[] num = new int[10];
		
		for (i=0;i<10;i++){
			System.out.println("Guarda un número: ");
			num[i] = Integer.parseInt(System.console().readLine());
			
		}
		
		for(x=9;x>=0;x--){
			System.out.println(x+" = "+ num[x]);
		}
	}
}

