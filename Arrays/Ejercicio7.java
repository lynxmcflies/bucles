public class Ejercicio7 {
	public static void main (String[] args){
		int[] numero = new int[100];
		int i;
		int primerValor;
		int segundoValor;
		
		for (i=0;i<100;i++){
			numero[i] = (int)(Math.random()*21);
			if (i==99){
				System.out.print(numero[i]+".");
			} else {
				System.out.print(numero[i]+", ");
			}
		}
		System.out.println();
		System.out.println("Mete el primer valor: ");
		primerValor = Integer.parseInt(System.console().readLine());
		System.out.println("Mete el segundo valor: ");
		segundoValor = Integer.parseInt(System.console().readLine());
		
		for (i=0;i<100;i++){
			if (numero[i]==primerValor){
				numero[i] = segundoValor;
			}
			System.out.print(numero[i]+", ");
		}
		
		
		
	}
}
