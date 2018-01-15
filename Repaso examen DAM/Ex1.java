public class Ex1 {
	public static void main (String[] args){
		int[] aleatorios = new int[20];
		int i;
		int x;
		int contadorPrimos = 0;
		
		for (i=0;i<20;i++){
			aleatorios[i] = (int)((Math.random()*99)+2);
		}


		for(i=0;i<20;i++){
			boolean esPrimo = true;
			for (x=2;x<aleatorios[i];x++){
				if((aleatorios[i]%x) == 0){
					esPrimo = false;
				}
			}
			if (esPrimo == true){
				System.out.println(i+":	"+aleatorios[i]+"	es primo!");
				contadorPrimos++;
			}
		}
		
		if (contadorPrimos==0){
			System.out.println("No se han encontrado números primos");
		}
		
	}		
}
		
