
public class InteSimp extends Integrales{
	double ResPar, ResImpar,ResTotal, t[];
	
	public InteSimp(){
		System.out.println("\n\tMétodo de Integración Simpson 1/3\n");
	}
	void ObtnerXi(int n, double t0){
		t= new double [n];
		for(int i=1;i<n;i++){
			t0+=Delta;
			t[i]=t0;
		}
	}
	void EvIntegral(double a, double b, int NumIter, int NumElem,double x[],double y[]){
		for(int i=1;i<NumIter;i++){
			if(i%2==0)
			{
			ResPar+=EvLagrange(t[i], NumElem,x,y);
			}
			if(i%2==1)
			{
			ResImpar+=EvLagrange(t[i], NumElem,x,y);
			}
		}
			ResTotal=((b-a)/(3*NumIter))*(EvLagrange(a, NumElem,x,y)+(4*ResImpar)+(2*ResPar)+EvLagrange(b, NumElem,x,y));
			Redondear r= new Redondear();
			System.out.println("\nEl resultado de la integral en el intervalo["+r.redondeo(a,1)+","+
			r.redondeo(b,1)+"] es: "+r.redondeo(ResTotal,4));
			System.out.println("Con un número de "+NumIter+" iteraciones");
	}

}
