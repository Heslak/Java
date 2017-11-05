
public class Matrices {
	
	double matriz[][], b[],acum=0;
	int i;
	
	void crearMatriz(int j){
		i=j;
		matriz= new double[i][i];
		b= new double [i];
	}
	void rellenarMatriz(){
		for (int a=0;a<i;a++)
		{
			for (int b=0;b<i;b++)
			{
				matriz[a][b]=a-b;
			}
		}
	}
	void imprimirMatriz(){
		for (int a=0;a<i;a++)
		{
			for (int b=0;b<i;b++)
			{
					System.out.print(matriz[a][b]+"\t");
			}
			System.out.println();
		}
	}
	void sumarRenglones(){
		for (int a=0;a<i;a++)
		{
			acum=0;
			for(int b=0;b<i;b++)
			{
				acum=acum+matriz[a][b];
			}
			b[a]=acum;
		}
	}
	 void imprimirResultado(){
		 for (int a=0;a<i;a++)
			{
				System.out.println(b[a]);
			}
	 }
}
