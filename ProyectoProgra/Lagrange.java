
public class Lagrange extends LeerArchivo {
	double result=1, acum=1,polinomio=0;
	
	public double EvLagrange(double ValorEv,int NumElem,double x[], double y[]){
		double L[]= new double[NumElem];
		for(int i=0;i<NumElem;i++){
			acum=1;
			for(int j=0;j<NumElem;j++){
				if(i!=j)
				{
					acum*=(ValorEv-x[j])/(x[i]-x[j]);
				}
			}
			L[i]=acum;
			acum=1;
		}
		polinomio=0;
		for(int i=0;i<NumElem;i++)
		{
			polinomio+=L[i]*y[i];
		}
		return polinomio;
	}
}
