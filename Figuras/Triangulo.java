
public class Triangulo extends Figura {
		double areatriang,basetriang,alturatriang;
		void establecerbaseyaltura(double a, double b){
			 basetriang=b;
			 alturatriang=a;
		}
		void calculaarea(){
			areatriang=(basetriang*alturatriang)/2;
		}
		double obtenareatriang(){
			return areatriang;
		}
	}
