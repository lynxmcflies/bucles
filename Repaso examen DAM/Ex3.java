public class Ex3 {
	public static void main (String[] args){
		int[] aleatorios = new int[15];
		int i;
		int x;
		
		for (i=0;i<15;i++){
			aleatorios[i] = (int)(Math.random()*501);
			System.out.print(aleatorios[i]+" ");
		}
		
		System.out.println();
		
		for (i=0;i<15;i++){
			if(aleatorios[i]%5==0){
				System.out.print(aleatorios[i]+" ");
			} else {
				for(x=0;aleatorios[i]%5!=0;x++){
					aleatorios[i]++;
					if(aleatorios[i]%5==0){
						System.out.print(aleatorios[i]+" ");
					}
				}
			}
		}
		
	}		
}
		


