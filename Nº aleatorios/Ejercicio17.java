public class Ejercicio17 {
	public static void main (String[] args){
		System.out.println("Introduzca la altura de la pecera");
		int alto = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca la anchura de la pecera");
		int ancho = Integer.parseInt(System.console().readLine());
		
		
		int altoAleatorio = (int)((Math.random()*(alto-2))+2);
		int anchoAleatorio = (int)((Math.random()*(ancho-2))+2);
		int i = 0;
		int x = 2;
		int z = 2;
		
		for (i=0;i<ancho;i++){
			System.out.print("*");
		} System.out.println();
		//////////////////////////////	
		for (x=2;x<alto;x++){
			System.out.print("*");
			if(x==altoAleatorio){
				for (z=2;z<ancho;z++){
					if(z==anchoAleatorio){
						System.out.print("&");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				for (z=2;z<ancho;z++){
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		} 
		//////////////////////////////////
		for (i=0;i<ancho;i++){
			System.out.print("*");
		}
	}
}



