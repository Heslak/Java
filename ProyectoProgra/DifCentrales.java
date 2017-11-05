
public class DifCentrales extends Derivadas {
	double ResDervCent;
	public DifCentrales(){
		System.out.println("\n\tMétodo de Derivación de Diferencias centrales\n");
	}
	void EvDerivada(double DeltaX,double X0, int NumElem, double x[], double y[]){
		ResDervCent=(EvLagrange(X0+DeltaX, NumElem,x,y)-EvLagrange(X0-DeltaX, NumElem,x,y))/(2*DeltaX);
		Redondear r= new Redondear();
		System.out.println("\nEl Resultado de la derivada en el punto "+r.redondeo(X0, 3)+" con un incremento de "+
				r.redondeo(DeltaX, 3)+" es: "+r.redondeo(ResDervCent,3));
	}

}
