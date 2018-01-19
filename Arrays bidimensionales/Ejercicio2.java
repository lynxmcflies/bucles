public class Ejercicio2 {
	public static void main (String[] args){
	
		int[][] num = new int[3][6];
    num[0][1] = 30;
    num[0][2] = 2;
		num[0][5] = 5;
    num[1][0] = 75;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    for (int i=0;i<3;i++){
      System.out.print("Fila "+i+": ");
      for(int x=0;x<5;x++){
        System.out.print("| "+num[i][x]+" |");
      }
      System.out.println();
    }
    
	}		
}
		
