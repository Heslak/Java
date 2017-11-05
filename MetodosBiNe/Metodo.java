
public class Metodo {
	double sig,actual=0,vinicial=2,tolerancia=0.001,c,a=-1,b=2;
	int i=1,j=1;
		double error(double a, double b){
			return (Math.abs(a-b)/Math.abs(a))*100;
		}
}
