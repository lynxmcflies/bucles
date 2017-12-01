public class Ejercicio9 {
	public static void main (String[] args) {
		
		int i = 0;
		int termina = 24;
		int azar = 0;
		
		for(i=0;termina!=azar;i++){
			azar = (int)(Math.random()*101);
			if(azar%2==0){
				System.out.println(azar);
			}
		}
	}
}
