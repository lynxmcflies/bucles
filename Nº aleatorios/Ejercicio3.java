public class Ejercicio3 {
	public static void main (String[] args) {
		int azar = (int)((Math.random()*10)+1);
		int palo = (int)((Math.random()*4)+1);
		switch (azar){
			case 8:
				System.out.print("sota");
				break;
			case 9:
				System.out.print("caballo");
				break;
			case 10:
				System.out.print("rey");
				break;
			case 1:
				System.out.print("A");
				break;
			default:
				System.out.print(azar);
			
		}
		
		switch (palo){
			case 1:
				System.out.print(" de bastos");
				break;
			case 2:
				System.out.print(" de oro");
				break;
			case 3:
				System.out.print(" de copas");
				break;
			case 4:
				System.out.print(" de espadas");
				break;			
		}
	}
}
