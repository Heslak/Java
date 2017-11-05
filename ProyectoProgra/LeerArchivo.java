import java.io.*;
import java.util.Scanner;

public class LeerArchivo {
	double y[], x[];
    int NumElem=0;
    
    public int ObtenerNumLineas()
    {
    	try {
    		File archivo=new File("C:\\Users\\Sergio\\Google Drive\\prueba.txt");
			Scanner lectura=new Scanner(archivo);
			System.out.println("\nLos datos que se encuentran en el archivo son:");
			while(lectura.hasNextLine()){
				System.out.println(lectura.nextLine());
				NumElem++;
			     }
			lectura.close();
    	} catch (FileNotFoundException e) {}
    	return NumElem;
    }
    public void ObtenerDatos()
    {
    	try {
    		File archivo=new File("C:\\Users\\Sergio\\Google Drive\\prueba.txt");
			Scanner lectura=new Scanner(archivo);
			y= new double[NumElem];
	        x=new double[NumElem];
	        NumElem=0;
			while(lectura.hasNextLine()){
				x[NumElem]=lectura.nextDouble();
				y[NumElem]=lectura.nextDouble();
				NumElem++;
			   }
			lectura.close();
    	} catch (FileNotFoundException e) {}
    }
    public double [] RegresarX(){
    	return x;
    }
    public double [] RegresarY(){
    	return y;
    }
}
