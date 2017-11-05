import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class PruebaArchivo {
    public static void main(String[] args)throws IOException{
    	int EscogerInt=1,EscogerMet=2, NumIter=0,NumElem,EscogerDeri=3,cont=0;
    	double x[],y[],DeltaX,X0,a=0,b=0,cambio;
    	char Des='s';
    	do{
    	System.out.println("\tPrograma que Deriva e Integra de forma numérica\n");
    	Scanner s= new Scanner(System.in);
    	System.out.println("Escoja si quiere Integrar o Derivar la funciónen un punto");
    	System.out.println("\n1° Integrar");
    	System.out.println("2° Derivar");
    	try{
    		LeerArchivo Lee=new LeerArchivo();
    		NumElem=Lee.ObtenerNumLineas();
    		System.out.print("\nIngrese el número de la opción que desea realizar: ");
    		EscogerMet=s.nextInt();
    		Lee.ObtenerDatos();
    		x=Lee.RegresarX();
    		y=Lee.RegresarY();
    		switch(EscogerMet){
    	
    		case 1:
    			System.out.println("\t\tIntegración");
    			System.out.println("\nEscoja el método de integración que desea");
    			System.out.println("\n1° Método de Integración Trapezoidal");
    			System.out.println("2° Método de Integración Simpson 1/3");
    			System.out.print("\nIngrese el número de la opción que desea realizar: ");
    			EscogerInt=s.nextInt();
    			switch (EscogerInt){
    			
    			case 1:
    				IntTrape trape= new IntTrape();
    				System.out.print("Ingrese el límite inferior de la Integral: ");
    				a=s.nextFloat();
    				System.out.print("Ingrese el límite superior de la Integral: ");
    				b=s.nextFloat();
    				if(b<a){
    					cambio=b;
    					b=a;
    					a=cambio;
    				}
    				cambio=0;
    				System.out.print("Ingrese el número de Iteraciones que quiere realizar: ");
    				NumIter=s.nextInt();
    				if(NumIter!=0){
    					trape.ObtenerDelta(a, b, NumIter);
    					trape.EvIntegral(a, b,NumIter,NumElem,x,y);
    				}
    				else{
    					throw new ArithmeticException();
    				}	
    				break;
    	
    			case 2:
    				InteSimp simp= new InteSimp();
    				System.out.print("Ingrese el límite inferior de la Integral: ");
    				a=s.nextFloat();
    				System.out.print("Ingrese el límite superior de la Integral: ");
    				b=s.nextFloat();
    				if(b<a){
    					cambio=b;
    					b=a;
    					a=cambio;
    				}
    				cambio=0;
    				NumIter=3;
    				while(NumIter%2==1){
    					if(cont==0){
    						System.out.print("Ingrese el número de Iteraciones que quiere realizar (Sólo Iteraciones pares): ");
    						cont++;
    					}
    					else
    						System.out.print("Usted ha ingresado un número impar, por favor introduzca un número par de iteraciones");
    					NumIter=s.nextInt();
    					if(NumIter==0){
    						throw new ArithmeticException();	
    					}
    				}
    				simp.ObtenerDelta(a, b, NumIter);
    				simp.ObtnerXi(NumIter, a);
    				simp.EvIntegral(a, b, NumIter,NumElem,x,y);
    				break;
    			default:
    				System.out.println("\nNo ha escogido ninguna opción posible");
    				break;
    			}
    			break;
    	
    		case 2:
    			System.out.println("\t\tDerivación");
    			System.out.println("\nEscoja el método de derivación que desea");
    			System.out.println("\n1° Derivación con Diferencia hacía adelante");
    			System.out.println("2° Derivación con Diferencia hacía atras");
    			System.out.println("3° Derivación con Diferencias centradas\n");
    			System.out.print("\nIngrese el número de la opción que desea realizar: ");
    			EscogerDeri=s.nextInt();
    			switch(EscogerDeri){
    			case 1:
    				DifAdel Adl=new DifAdel();
    				System.out.print("\nIngrese el valor de x que quiere evaluar en la derivada: ");
    				X0=s.nextFloat();
    				System.out.print("Ingrese el incremento con el que quiere realizar el método: ");
    				DeltaX=s.nextFloat();
    				if(DeltaX==0)
    					throw new ArithmeticException();
    				Adl.EvDerivada(DeltaX, X0, NumElem, x, y);
    				break;
    			case 2:
    				DifAtras Atras=new DifAtras();
    				System.out.print("\nIngrese el valor de x que quiere evaluar en la derivada: ");
    				X0=s.nextFloat();
    				System.out.print("Ingrese el incremento con el que quiere realizar el método: ");
    				DeltaX=s.nextFloat();
    				if(DeltaX==0)
    					throw new ArithmeticException();
    				Atras.EvDerivada(DeltaX, X0, NumElem, x, y);
    				break;
    			case 3:
    				DifCentrales Central= new DifCentrales();
    				System.out.print("\nIngrese el valor de x que quiere evaluar en la derivada: ");
    				X0=s.nextFloat();
    				System.out.print("Ingrese el incremento con el que quiere realizar el método: ");
    				DeltaX=s.nextFloat();
    				if(DeltaX==0)
    					throw new ArithmeticException();
    				Central.EvDerivada(DeltaX, X0, NumElem, x, y);
    				break;
    			default:
    				System.out.println("\nNo ha escogido ninguna opción posible");
    				break;
    			}
    			break;
    		default:
    			System.out.println("\nNo ha escogido ninguna opción posible");
    			break;
    		}
    	}
    	catch (InputMismatchException Imp){
    		System.out.println("\n!Ingreso algun caractér equivocado¡ "+Imp);
    	}
    	catch (ArithmeticException cero){
    		System.out.println("\n!No se pueden hacer '0' iteraciones¡ "+cero);
    	}
    	System.out.print("\nIngrese 's' si desea volver a realizar otra vez alguna opción, de lo contrario presione cualquier tecla: ");
    	Des=(char)System.in.read();
    	System.out.println();
    	
    	}while(Des=='s' || Des=='S');
    	System.out.println("\t\tGracias por Utilizar el programa");
    }

}