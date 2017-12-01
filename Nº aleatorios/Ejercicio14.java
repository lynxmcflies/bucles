public class Ejercicio14 {
	public static void main (String[] args){
		int miNumero = (int)(Math.random()*3);
		int i = 1;
		int acierta = 102;
		int intentos = 4;
		System.out.print("¿Qué número estoy pensando de 0 a 100?: ");
		
		while((miNumero != acierta) && (i <= 5)){
			acierta = Integer.parseInt(System.console().readLine());
			if (miNumero==acierta){
				System.out.println("Baia baia... has acertado :)");
			} else if((miNumero!=acierta) && (intentos == 0)) {
				System.out.println("Lo siento, no lo has logrado :(");
			} else {
				System.out.println("Fallaste, te quedan "+intentos+" intentos, vuelve a intentarlo:");
			}
			intentos--;
			i++;
		}
		
	}
}



