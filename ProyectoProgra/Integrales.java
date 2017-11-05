
public abstract class Integrales extends Lagrange {
	double Delta;
	void ObtenerDelta(double a, double b, int n){
		Delta=(b-a)/n;
	}
	abstract void EvIntegral(double a, double b, int NumIter, int NumElem,double x[],double y[]);
	
}
