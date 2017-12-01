public class Ejercicio8 {
	public static void main (String[] args){
	
		int[] meses = new int[12];
		int i;
		int x;
		int z;
		int aux;
		
		System.out.println("¿Qué temperatura media ha hecho en cada mes? de enero a diciembre");
		
		for (i=0;i<12;i++){
			meses[i] = Integer.parseInt(System.console().readLine());
		}
		
		for (x=0;x<12;x++){
			System.out.print("Mes "+x+": ");
			aux = meses[x];
			for(z=0;z<aux;z++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}		
}
		
