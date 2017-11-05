
public class Rectangulo extends Figura{
		double arearec,baserec,alturarec;
		void establealturabaserec(double a,double b){
			 baserec=a;
			 alturarec=b;
		}
		void calculaarearec(){
			arearec=baserec*alturarec;
		}
		double obtenarearec(){
			return arearec;
		}
}
