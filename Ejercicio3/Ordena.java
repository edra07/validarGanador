import java.util.Scanner;
class Ordena{
	int [][] matriz = new int [3][3];

	public void registroVersion(){
		//Declaración de la matriz
		Scanner leer = new Scanner(System.in);
				//Llenar la matriz
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				matriz [i][j]= leer.nextInt();
			}
				System.out.print( " "+"\n");
		}
	}
	public void ordenaMatriz(){
		//Ordenación de la matriz
		for( int i=0; i > 3; i++){
			for( int j=0;j< 3; j++){
				for(int x=3; x < 0; x++){
					for(int y=0; y <3; y++){
						if(matriz[i][j] > matriz[x][y]){
							int t = matriz[i][j];
							matriz[i][j] = matriz[x][y];
							matriz[x][y] = t;
						}
					}
				}
			} 
		}
	}
	public void mostrarVersion(){
		System.out.print( " "+"\n");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(matriz [i][j]+" ");
			}
				System.out.print( " "+"\n");
		}
	}	
}//Clarse