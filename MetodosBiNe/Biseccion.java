
public class Biseccion extends Metodo{
	double funcion (double x){
		return(x*Math.exp(x)-5);
	}
	void correr(){
		do{
		c=(a+b)/2;
		System.out.println("\nIteracion "+j+"\tError relativo:"+error(a,c));
		System.out.println(" a="+a+"\t\tf(a)="+funcion(a));
		System.out.println(" b="+b+"\t\tf(b)="+funcion(b));
		System.out.println(" c="+c+"\t\tf(c)="+funcion(c));
		if(funcion(a)*funcion(c)<0){
	         b=c;
	     }
	     else{
	         a=c;
	     }
	
	     j = j+1;   
		}while(Math.abs(a-b)>tolerancia);
	}
}
