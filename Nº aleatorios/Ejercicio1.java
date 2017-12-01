public class Ejercicio1 {
	public static void main (String[] args) {
		int i = 0;
		int dado = 0;
		
		for(i=0;i<3;i++){
			dado =(int)((Math.random()*6)+1);
			switch (dado){
				case 1:
					System.out.println("⚀");
					break;
				case 2:
					System.out.println("2");
					break;
				case 3:
					System.out.println("3");
					break;
				case 4:
					System.out.println("4");
					break;
				case 5:
					System.out.println("5");
					break;
				case 6:
					System.out.println("6");
					break;
			}
		}
		
	}
}
