public class IntTrape extends Integrales {
	double ResIntTrap;
	public IntTrape(){
		System.out.println("\n\tMétodo de Integración Trapezoidal\n");
	}
	public void EvIntegral(double a, double b, int NumIter, int NumElem,double x[],double y[])
	{
	for(int i=1; i<NumIter;i++)
		{
			ResIntTrap+=EvLagrange(a+i*(Delta), NumElem,x,y);
		}
		ResIntTrap=ResIntTrap*2;
		ResIntTrap=(Delta/2)*(EvLagrange(a, NumElem,x,y)+ResIntTrap+EvLagrange(b, NumElem,x,y));
		Redondear r= new Redondear();
		System.out.println("\nEl resultado de la integral en el intervalo["+r.redondeo(a,1)+","+
		r.redondeo(b,1)+"] es: "+r.redondeo(ResIntTrap,4));
		if(NumIter!=1)
		System.out.println("Con un número de "+NumIter+" iteraciones");
		else
			System.out.println("Con un número de "+NumIter+" iteración");
	}	
}
