public class Ejercicio18 {
	public static void main (String[] args) {
		System.out.println("Introduce un número entero positivo: ");
		int x = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce otro número entero positivo: ");
		int y = Integer.parseInt(System.console().readLine());
		int i = 0;
		
		if(x<y){
			for (i=x;i<y;i+=7){
				if((x+7) > y){
					System.out.println("No hay números comprendidos de 7 en 7 entre las cifras introducidas");
				} else {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Los números introducidos no son correctos");
		}
	}
}

