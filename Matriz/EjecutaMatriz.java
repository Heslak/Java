
import java.util.Scanner;

public class EjecutaMatriz {

	
	public static void main(String[] args) {
		int i;
		Scanner s= new Scanner(System.in);
		System.out.println("Programa para sumas los renglones de una matriz de nxn\n");
		System.out.println("Ingrese el número de renglones y columnas que quiere sea la matriz");
		
		i=s.nextInt();
		
		Matrices m= new Matrices();
		
		m.crearMatriz(i);
		m.rellenarMatriz();
		System.out.println("La matriz que se va a sumar  es : \n");
		m.imprimirMatriz();
		m.sumarRenglones();
		System.out.println("\nEl resultado de la suma de los renglones de la matriz es: \n");
		m.imprimirResultado();
	}

}
