public class Ejercicio8 {
	public static void main (String[] args) {
		
		int i = 1;
		
		for(i=1;i<15;i++){
			System.out.print(i+":	");
			int azar = (int)(Math.random()*6);
			switch (azar){
				case 0:
					System.out.print("|1|-|-|");
					break;
				case 1:
					System.out.print("|1|-|-|");
					break;
				case 2:
					System.out.print("|1|-|-|");
					break;
				case 3:
					System.out.print("|-|x|-|");
					break;
				case 4:
					System.out.print("|-|x|-|");
					break;
				case 5:
					System.out.print("|-|-|2|");
					break;
			}
			System.out.println(" ");
		}
		
	}
}
