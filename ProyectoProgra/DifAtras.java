
public class DifAtras extends Derivadas{
	double ResDervAtr;
	public DifAtras(){
		System.out.println("\n\tMétodo de Derivación de Diferencias hacia atras");
	}
	public void EvDerivada(double DeltaX,double X0, int NumElem, double x[], double y[]){
		ResDervAtr=(EvLagrange(X0, NumElem,x,y)-EvLagrange(X0-DeltaX, NumElem,x,y))/DeltaX;
		Redondear r= new Redondear();
		System.out.println("\nEl Resultado de la derivada en el punto "+r.redondeo(X0, 3)+" con un incremento de "+
				r.redondeo(DeltaX, 3)+" es: "+r.redondeo(ResDervAtr,3));
	}

}
