//Programa qu lee argumentos numéricos y luego los divide
//Hecho por Sergio Acosta Vega

public class Argumentos {																			//Nombre de la clase

	public static void main(String[] args) {														//Llamando a la función main para ejecutar
		float dividendo=0,divisor=0;																//Declaración de variables flotates
		try{																						//Try para obtener excepciones
			System.out.println("Programa que lee argumentos numéricos y los divide");				//Mensaje de lo que hace el programa
			System.out.println("\nLos argumentos que se leyeron son: "+args[0]+" y "+args[1]);		//Mensaje queda el valor de los argumento
			dividendo=Integer.parseInt(args[0]);													//Pasando los argumentos a flotante
			divisor=Integer.parseInt(args[1]);														//pasando los argumentos a flotante
			if(divisor!=0)																			//Condición de ejecución
				System.out.println("\nEl resultado de la división es: "+dividendo/divisor);			//Impresión en pantalla del resultado de la división
			else																					//Else por si no se cumple la condición
				throw new ArithmeticException();													//Creación de un objeto de excepción
		}																							//Llave de cerradura el try
		catch(ArrayIndexOutOfBoundsException ok){													//Catch para recibir excepción
			System.out.println("No hay argumentos "+ok.getMessage());								//Mensaje de que no hay argumentos
		}																							//Llave de cerradur del catch
		catch(NumberFormatException no){															//Catch para recibir excepción
			System.out.println("No se pueden pasar convertir los argumentos "+no.getMessage());		//Mensaje de que no se pueden convertir los arumentos
		}																							//Llave de cerradura del Catch
		catch(ArithmeticException cero){															//Cath para recibir excepción
			System.out.println("No se puede divir entre cero");										//Mensaje de que no se puede dividir entre cero
		}																							//Llave de cerradura del Catch
	}																								//Llave de cerradura del main

}																									//Llave de cerradura de la clase
