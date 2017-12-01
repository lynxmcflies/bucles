public class Ejercicio7 {
	public static void main (String[] args) {
		System.out.print("Introduce 4 números. La clave no es 3455 guiño guiño: ");
		int introducido = Integer.parseInt(System.console().readLine());
		int combinacion = 3455;
		int intentos = 1;

		if(introducido==combinacion){
			System.out.print("Has abierto la caja");
		} else {
			for(intentos=1;(intentos<4)&&(introducido!=combinacion);intentos++){
				System.out.print("Clave incorrecta. Vuelve a intentarlo: ");
				introducido = Integer.parseInt(System.console().readLine());
			} if(introducido==combinacion){
					System.out.print("Has abierto la caja.");
				} else {
					System.out.print("Has agotado tus 4 oportunidades.");
				}
		}
	}
}
