
public class Cuadrado extends Figura{
	double areacuadrado,ladocuadrado;
	void establecerladocua(double a){
		 ladocuadrado=a;
	}
	void calculaareacua(){
		areacuadrado=ladocuadrado*ladocuadrado;
	}
	double obtenareacua(){
		return areacuadrado;
	}
}
