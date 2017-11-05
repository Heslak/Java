
public class Circulo extends Figura{
	double areacirc,radio;
	void establecerradio(double a){
		 radio=a;
	}
	void calculaareacirc(){
		areacirc=3.1416*radio*radio;
	}
	double obtenareacirc(){
		return areacirc;
	}
}
