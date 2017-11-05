
public class Newton extends Metodo{
	double funcion(double x){
		return x-((x*Math.exp(x)-5)/(x*Math.exp(x)+Math.exp(x)));
	}
	void calcula(){
		sig=vinicial;
		while(Math.abs(sig-actual)>tolerancia){
			actual=sig;
			sig=funcion(actual);
			System.out.println("\nIteración "+i+"\tError relativo " +error(actual,sig));
			System.out.println("\t Xn="+actual+"\tXn+1="+sig);
			i=i+1;
		}
	}
}
