public class Ejercicio2 {
	public static void main (String[] args) {
		int azar = (int)((Math.random()*13)+1);
		int palo = (int)((Math.random()*4)+1);
		switch (azar){
			case 11:
				System.out.print("J");
				break;
			case 12:
				System.out.print("Q");
				break;
			case 13:
				System.out.print("K");
				break;
			case 1:
				System.out.print("A");
				break;
			default:
				System.out.print(azar);
			
		}
		
		switch (palo){
			case 1:
				System.out.print(" de picas");
				break;
			case 2:
				System.out.print(" de tréboles");
				break;
			case 3:
				System.out.print(" de rombos");
				break;
			case 4:
				System.out.print(" de corazones");
				break;			
		}
		
	}
}
