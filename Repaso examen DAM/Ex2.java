public class Ex2 {
	public static void main (String[] args){
		System.out.println("Selecciona una estación del año: ");
		System.out.println("1. Primavera");
		System.out.println("2. Verano");
		System.out.println("3. Otoño");
		System.out.println("4. Invierno");
		
		int estacion = Integer.parseInt(System.console().readLine());
		int temp1 = 0;
		int temp2 = 0;
		int nublado = 0;
		
		switch (estacion){
			case 1:
				temp1 = (int)((Math.random()*16)+15);
				temp2 = (int)((Math.random()*16)+15);
				nublado = (int)(Math.random()*10);
				System.out.println("Previsión del tiempo para mañana");
				System.out.println("--------------------------------");
				if (temp1 > temp2){
					System.out.println("Temperatura máxima: "+ temp1);
					System.out.println("Temperatura mínima: "+ temp2);
				} else {
					System.out.println("Temperatura máxima: "+ temp2);
					System.out.println("Temperatura mínima: "+ temp1);
				}
				if (nublado < 6){
					System.out.println("Soleado");
				} else {
					System.out.println("Nublado");
				}
				break;
			case 2: 
				temp1 = (int)((Math.random()*21)+25);
				temp2 = (int)((Math.random()*21)+25);
				nublado = (int)(Math.random()*10);
				System.out.println("Previsión del tiempo para mañana");
				System.out.println("--------------------------------");
				if (temp1 > temp2){
					System.out.println("Temperatura máxima: "+ temp1);
					System.out.println("Temperatura mínima: "+ temp2);
				} else {
					System.out.println("Temperatura máxima: "+ temp2);
					System.out.println("Temperatura mínima: "+ temp1);
				}
				if (nublado < 8){
					System.out.println("Soleado");
				} else {
					System.out.println("Nublado");
				}
				break;
			case 3: 
				temp1 = (int)((Math.random()*11)+20);
				temp2 = (int)((Math.random()*11)+20);
				nublado = (int)(Math.random()*10);
				System.out.println("Previsión del tiempo para mañana");
				System.out.println("--------------------------------");
				if (temp1 > temp2){
					System.out.println("Temperatura máxima: "+ temp1);
					System.out.println("Temperatura mínima: "+ temp2);
				} else {
					System.out.println("Temperatura máxima: "+ temp2);
					System.out.println("Temperatura mínima: "+ temp1);
				}
				if (nublado < 4){
					System.out.println("Soleado");
				} else {
					System.out.println("Nublado");
				}
				break;
			case 4: 
				temp1 = (int)(Math.random()*26);
				temp2 = (int)(Math.random()*26);
				nublado = (int)(Math.random()*10);
				System.out.println("Previsión del tiempo para mañana");
				System.out.println("--------------------------------");
				if (temp1 > temp2){
					System.out.println("Temperatura máxima: "+ temp1);
					System.out.println("Temperatura mínima: "+ temp2);
				} else {
					System.out.println("Temperatura máxima: "+ temp2);
					System.out.println("Temperatura mínima: "+ temp1);
				}
				if (nublado < 2){
					System.out.println("Soleado");
				} else {
					System.out.println("Nublado");
				}
				break;
		}
		
	}		
}
		
